package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int len = chars.length;
        int count = 0;
        String out = "";
        while(count<len) {
            out = out + chars[count];
            count++;
        }
        System.out.print(out);
    }
}
