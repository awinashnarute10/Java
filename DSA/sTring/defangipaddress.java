package DSA.sTring;

public class defangipaddress {
    public static void main(String[] args) {
        String address = "255.100.50.0";
        System.out.println(defangIPaddr(address));
    }

    public static String defangIPaddr(String address) {
        // return address.replace(".","[.]");
        StringBuilder builder = new StringBuilder();

        for(int i =0; i<address.length(); i++)
        {
            char c = address.charAt(i);
            builder.append((c=='.')?"[.]":c);
        }
        
        return builder.toString();
    }
    
}
