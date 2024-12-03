import java.util.Arrays;

public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {

        String[] newSentences = new String[sentences.length];
        String[] newKeywords = new String[keywords.length];

        for (int i =0; i<sentences.length;i++){
            newSentences[i] = "";
             for (int j =0; j<sentences[i].length();j++){
			    char curentChar= sentences[i].charAt(j);
                    if ((curentChar>=65) && (curentChar <=90)){
                        newSentences[i] += (char) (curentChar+32);
            }
            else{
                newSentences[i] += curentChar;
            }
        }
    }
    for (int i =0; i<keywords.length;i++){
        newKeywords[i] = "";
         for (int j =0; j<keywords[i].length();j++){
            char curentChar= keywords[i].charAt(j);
                if ((curentChar>=65) && (curentChar <=90)){
                    newKeywords[i] += (char) (curentChar+32);
                }
                else{
                    newKeywords[i] += curentChar;
                }
    }
}
        for (int i =0; i<newSentences.length;i++){
            boolean foundKeyword = false; 
            for (int j =0; j <newKeywords.length;j++){
                String strKeyword = newKeywords[j];
                   
                     for (int k = 0; k  <= newSentences[i].length() - strKeyword.length(); k++) {
                        boolean foundMach = true;
                            for (int m= 0; m <strKeyword.length(); m++){
                                if (newSentences[i].charAt(k+m)!= strKeyword.charAt(m)){
                                    foundMach = false;
                                    break;
                            }
                    }
                        if (foundMach){
                            System.out.println(sentences[i]);
                            foundKeyword = true;
                            break;
                        }
                        }
                         if (foundKeyword) {
                            break;
                        }
                    }   
                }
        


        }
        } 
    
        