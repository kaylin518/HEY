public class order { public static void main(String[] args) { } public static String asciiOrder(String phrase) { int[] arr = new int[phrase.length()];for (int i = 0; i < phrase.length(); i++) { arr[i] = (int) phrase.charAt(i); }  Sort.selectionSort(arr); return decode.decoder(arr);} } 
