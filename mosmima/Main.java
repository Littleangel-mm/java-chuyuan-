// 摩斯密码测试类


package mosmima;  
  
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.util.Map;  
import java.util.Map.Entry;  
import java.util.regex.Matcher;  
import java.util.regex.Pattern;  
  
/** 
 * 摩斯密码测试 
 * @author 小天使 
 */  
public class Main {  
  
    char plaintext[]; // 明文  
    String ciphertext[]; // 密文  
    StringBuffer plainStr = new StringBuffer(" ");  // 明文字符串  
    StringBuffer cipherStr = new StringBuffer(" "); // 密文字符串  
    // 实例化对照表对象  
    ContrastList C = new ContrastList();  
    Map<Character, String> maplist = C.maplist;  
      
    public static void main(String[] args) {  
        System.out.println("************ 欢迎使用摩尔斯电码程序  **************");  
        Main m = new Main();  
        m.init();   // 初始化  
        m.Encryption(); // 加密  
        m.Decryption(); // 解密  
    }  
      
    void init(){  
        System.out.println("请输入一段明文：");  
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));  
        while (true) {  
            // 正则验证 字母/数字/空格 , . ? + \ / : ; ! = ( )  
            Pattern p =Pattern.compile("^[\\s,\\w,\\.,\\?,\\+,:,;,!,',\",=,\\(,\\)]+$");   
            String str;  
            try {  
                str = bf.readLine();  
                Matcher m= p.matcher(str);  
                if(m.find()){  
                    plaintext = str.toUpperCase().toCharArray();    // 将输入字符转换大写数组字符类型  
                    break;  
                }  
            } catch (IOException e) {  
            }     
            System.out.println("未按规则输入..请重新输入..");  
        }  
    }  
      
    /** 
     * 加密 
     */  
    void Encryption(){  
        for(int i=0; i<plaintext.length; i++){  
            char tmp = plaintext[i];  
            /*  字母      */  
            if(maplist.containsKey(tmp))  
                cipherStr.append(maplist.get(tmp)).append(" "); // 追加空格  
        }  
        ciphertext = cipherStr.toString().split(" ");  
        System.out.println("加密后："+cipherStr);  
    }  
      
    /** 
     * 解密 
     */  
    void Decryption(){  
        for(int i=1; i<ciphertext.length; i++){  
            String tmp = ciphertext[i];  
            /*  字母      */  
            if(maplist.containsValue(tmp)){  
                for (Entry<Character, String> s : maplist.entrySet()) {  
                    if(tmp.equals(s.getValue())){  
                        plainStr.append(s.getKey().toString().toLowerCase());  
                    }  
                }  
            }  
        }  
        System.out.println("解密后："+plainStr);  
    }  
}
