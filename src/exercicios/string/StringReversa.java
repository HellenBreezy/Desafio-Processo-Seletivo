package exercicios.string;
public class StringReversa {
    public static void main(String[] args) {
        System.out.println(reverterString("Hellen"));
    }
    public static String reverterString(String strParam) {
        char[] arrayCharReverso = new char[strParam.length()];
        int ultimoIndiceParam = strParam.length() - 1;
        int indiceCharReverso = 0;
        int indiceCharParam = ultimoIndiceParam;
        while (indiceCharReverso <= ultimoIndiceParam) {
            arrayCharReverso[indiceCharReverso++] = strParam.charAt(indiceCharParam--);
        }
        return String.valueOf(arrayCharReverso);
    }
}