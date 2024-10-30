package mosmima;
 

import java.util.HashMap;  
import java.util.Map;  
  
/** 
 * 摩尔斯对照表 
 * @author程序喵
 */  
public class ContrastList {  
    Map<Character, String> maplist = new HashMap<Character, String>();// 摩尔斯编码表集合  
  
    public ContrastList() {  
        maplist.put('A', "●-");  
        maplist.put('B', "-●●●");  
        maplist.put('C', "-●-●");  
        maplist.put('D', "-●●");  
        maplist.put('E', "●");  
        maplist.put('F', "●●-●");  
        maplist.put('G', "--●");  
        maplist.put('H', "●●●●");  
        maplist.put('I', "●●");  
        maplist.put('G', "●---");  
        maplist.put('K', "-●-");  
        maplist.put('L', "●-●●");  
        maplist.put('M', "--");  
        maplist.put('N', "-●");  
        maplist.put('O', "---");  
        maplist.put('P', "●--●");  
        maplist.put('Q', "--●-");  
        maplist.put('R', "●-●");  
        maplist.put('S', "●●●");  
        maplist.put('T', "-");  
        maplist.put('U', "●●-");  
        maplist.put('V', "●●●-");  
        maplist.put('W', "●--");  
        maplist.put('X', "-●●-");  
        maplist.put('Y', "-●--");  
        maplist.put('Z', "--●●");  
  
        /* 数字电码0-9 */  
        maplist.put('0', "-----");  
        maplist.put('1', "●----");  
        maplist.put('2', "●●---");  
        maplist.put('3', "●●●--");  
        maplist.put('4', "●●●●-");  
        maplist.put('5', "●●●●●");  
        maplist.put('6', "-●●●●");  
        maplist.put('7', "--●●●");  
        maplist.put('8', "---●●");  
        maplist.put('9', "----●");  
  
        /* 标点符号，可自增删 */  
        maplist.put(',', "--●●--"); // ,逗号  
        maplist.put('.', "●-●-●-"); // .句号  
        maplist.put('?', "●●--●●"); // ?问号  
        maplist.put('!', "-●-●--"); // !感叹号  
        maplist.put('\'', "●----●");// '单引号  
        maplist.put('\"', "●-●●-●");// "引号  
        maplist.put('=', "-●●●-");  // =等号  
        maplist.put(':', "---●●●"); // :冒号  
        maplist.put(';', "-●-●-●"); // ;分号  
        maplist.put('(', "-●--●");  // (前括号  
        maplist.put(')', "-●--●-"); // )后括号  
        maplist.put(' ', "★");      // 留空格，这里的星号是自定义的  
    }  
}
