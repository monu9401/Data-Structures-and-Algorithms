public class Codec {

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<longUrl.length();i++)
        {
            char ch = longUrl.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                int x = (int)ch;
                String st = Integer.toHexString(x);
                sb.append(st);
            }
            else
                sb.append(ch);
            sb.append("^");
        }
        return sb.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<shortUrl.length();i++)
        {
            char ch = shortUrl.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                int j=i+1;
                while(j<shortUrl.length() && Character.isLetterOrDigit(shortUrl.charAt(j)))
                {
                    j++;
                }
                String s = shortUrl.substring(i,j);
                int x = Integer.parseInt(s,16);
                char c = (char)x;
                sb.append(c);
                    i=j-1;
            }
            else if(ch=='^')
            {}
            else
            {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));