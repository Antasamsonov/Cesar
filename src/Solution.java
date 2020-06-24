public class Solution {
    static String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

    private static String getCodingIncodMessage(String message, int key) {
        StringBuilder strBox = new StringBuilder(message.length());
        String tmp;
        int countCharsAlfabet = alphabet.length();
        for (int i = 0; i < message.length(); i++) {
            tmp = String.valueOf(message.charAt(i)).toLowerCase();
            if (alphabet.contains(tmp)) {
                int newLocate = alphabet.indexOf(tmp) + key % countCharsAlfabet;
                if (newLocate >= countCharsAlfabet) {
                    newLocate = alphabet.indexOf(tmp) % countCharsAlfabet + 1;
                } else if (newLocate < 0) {
                    newLocate = countCharsAlfabet + newLocate;
                }
                strBox.append(alphabet.charAt(newLocate));
            } else {
                strBox.append(tmp);
            }
        }
        return strBox.toString();
    }

    public static void main(String[] args) {

        String message = "Еъёчхф Вхзёюлх, адздёиу ф ждэщхб, црбх еёдюэчъщъгюъв южаижжзчх, ждчъёнъгжзчдв. Ъы зёюивй жёхчгюв бюнс ж ъы вдгивъгзхбсгрв аёхкдв. \n" +
                "Зъеъёс вгъ дмъчющгд, мзд гъюэцъьгджзс тздшд аёхкх фчбфъзжф жбъщжзчюъв гъждчъёнъгжзчх мъбдчъмъжадшд югщючющиивх. \n" +
                "Ф юэимюб чхни южздёюу ю чгыж юэвъгъгюф, здмгъъ дзёхэюч еджздфггиу юэвъгмючджзс мъбдчъмъжаюк едёдадч. \n" +
                "Ю зъв гъ въгъъ, еджбъщдчхбх гъищхмх. Ф еёюнъб а чрчдщи, мзд чюгдя чжъви вдя югзъббъаз, х чдэвдьгд, вды мёъэвъёгдъ жзёъвбъгюъ ад чжъви шхёвдгюмгдви. \n" +
                "Гхязю ёънъгюъ вгъ едвдшбх еёдшёхввх югзиюзючгдшд зюех, жеълюхбсгд ждэщхггхф щбф юэимъгюф деёъщъбъггрк жздёдг мъбдчъмъжадя щиню. \n" +
                "Въгф вдьгд гхэчхзс дзлдв Вхзёюлр, х ъы, цъэ еёъичъбюмъгюф, вхзъёсу.\n";


        for (int i = 1; i < 32; i++) {
            String deCodeMessage = getCodingIncodMessage(message, -i);
            System.out.println(i);
            System.out.println(deCodeMessage);
            System.out.println("************");
        }
    }
}
