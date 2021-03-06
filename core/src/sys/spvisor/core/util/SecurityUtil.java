package sys.spvisor.core.util;

import java.text.DateFormat;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.log4j.Logger;

public class SecurityUtil {
	private static Logger logger = Logger.getLogger(SecurityUtil.class);
	
	private static final DateFormat df = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.SHORT);
	
	public static boolean matchPassword(final String maskedPassword, final String salt, final String password) {
        boolean result = maskedPassword.equalsIgnoreCase(calcMaskedPassword(salt, password));
        //logger.info("matchPassword failed, masked maskedPassword is "+calcMaskedPassword(salt, password));
        logger.info("matchPassword failed, masked password is "+maskedPassword);
        return result;
    }
	
	public static String calcMaskedPassword(String salt, String password) {
        return DigestUtils.sha1Hex(blend(salt.getBytes(), password.getBytes()));
    }
	
	public static String genSalt(String username) {
//        String now = df.format(new java.util.Date());
        return Base64.encodeBase64String(username.getBytes());
    }
	
	private static byte[] blend(byte[] a, byte[] b) {
        byte[] result = new byte[a.length + b.length];
        int ai = 0;
        int bi = 0;
        for (int i = 0; i < result.length; i++) {
            if (ai == a.length || bi < ai && bi < b.length) {
                result[i] = b[bi++];
                continue;
            }
            if (bi == b.length || ai <= bi) {
                result[i] = a[ai++];
                continue;
            }
        }
        return result;
    }
	

}
