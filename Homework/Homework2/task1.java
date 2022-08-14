package Homework.Homework2;
public class task1 {
    public static void main(String[] args) {
//у меня нет понимания понятия "окно в строке". 
//здесь приведено решение в разрезе той логики, как обсуждали на семинаре.
//наименьшее окно получается (показалось)  - и есть вторая строка...        
        String s1 = "HelloJavaJavaCode JavaDoc";
        String s2 = "Java"; 
        System.out.println("Подопытная строка: " + s1);
        System.out.println("Разыскиваемое окно: " + s2);
        if (s1.contains(s2) == false) {
            System.out.println("В исходной строке отсутствуют окна другой строки");
        }
        else {
            System.out.println("Наименьшее окно: " + s2);
        }
//но это подозрительно просто
//поэтому далее привожу решение в разрезе логики от наставника в комментариях к семинару2
        String sample = "this is a test string";
        String pattern =  "tist";
        System.out.println();
        System.out.println("Подопытная строка: " + sample);
        System.out.println("Разыскиваемое окно: " + pattern);
        System.out.print("Наименьшее окно, которое содержит искомые буквы: " + pickSubstring(sample, pattern));
        System.out.println();  
    }
    public static String pickSubstring(String samp_str ,String pat_str) {
        int ln1  = samp_str.length();
        int ln2  = pat_str.length();
        if(ln1 < ln2)
        { 
            return "отсутствует (попробуйте окно покороче)";
        } 
        int gvn_strg [] = new int[Character.MAX_VALUE]; 
        int pat_stgr [] = new int[Character.MAX_VALUE];
        for(int i=0;i<ln2;i++)
            pat_stgr[pat_str.charAt(i)]++;
            int ctr = 0, start = 0, start_index = -1, min_length = Integer.MAX_VALUE; 
            for(int j=0; j<ln1; j++) {
                gvn_strg[samp_str.charAt(j)]++;
                if(pat_stgr[samp_str.charAt(j)] != 0 && gvn_strg[samp_str.charAt(j)] <= pat_stgr[samp_str.charAt(j)])
                    ctr++;
                if(ctr == ln2)
                {
                    while(gvn_strg[samp_str.charAt(start)] > pat_stgr[samp_str.charAt(start)] || pat_stgr[samp_str.charAt(start)] == 0)
                    {
                        if(gvn_strg[samp_str.charAt(start)] > pat_stgr[samp_str.charAt(start)] || pat_stgr[samp_str.charAt(start)] == 0)
                            gvn_strg[samp_str.charAt(start)]--;
                        start++;
                    }
                    int length_window = j - start + 1;
                    if(min_length > length_window)
                    {
                        min_length = length_window;
                        start_index = start;
                    }
                }
            }
            if(start_index == -1)
            {
                return "отсутствует";
            }
        return samp_str.substring(start_index,start_index + min_length);
    }
}

