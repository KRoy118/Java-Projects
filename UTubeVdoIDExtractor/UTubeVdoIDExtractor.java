import java.io.*;
import java.util.*;
public class UTubeVdoIDExtractor {
	public static void main (String[]args) {
        Scanner sc=new Scanner(System.in);
        String link=sc.nextLine();
		String retuurn=link.replaceAll("(.*v=)|(.*/)", "")
			.replaceAll("([-\\w]+).*", "$1");
            System.out.println(retuurn);
	}
}