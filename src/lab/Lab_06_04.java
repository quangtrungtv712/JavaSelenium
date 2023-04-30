package lab;

import java.util.Scanner;

public class Lab_06_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("URL example: https://google.com");
        System.out.print("Please input your url: ");
        String inputURL = sc.next();
        System.out.println("Check http/https: " + checkMethod(inputURL));
        System.out.println("Check domain name: " + checkDomainName(inputURL));
        System.out.println("Check .com/.net : " + checkDotComOrDotNet(inputURL));
    }

    public static boolean checkMethod(String urlTest) {
        String[] urlTestSplit = urlTest.split("://");
        String methodTest = urlTestSplit[0];
        if (methodTest.equals("http")) {
            System.out.println("This website use protocal http method");
            return true;
        } else if (methodTest.equals("https")) {
            System.out.println("This website use protocal https method");
            return true;
        } else
            System.out.println("Invalid method");
            return false;
    }

    public static boolean checkDomainName(String url) {
        String[] urlSplit = url.split("://");
        String domainName = urlSplit[1].substring(0, 4);
        if (domainName.equals("google"))
            return true;
        else
            return false;
    }

    public static boolean checkDotComOrDotNet(String url) {
        String inforCorrect = url.substring(url.length() - 4, url.length());
        if (inforCorrect.equals(".com"))
            return true;
        else if (inforCorrect.equals(".net"))
            return true;
        else
            return false;
    }
//}
//    public static void main(String[] args) {
//        String url;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please input URL: ");
//        url = scanner.nextLine();
//
//        public static String checkProtocol(String url) {
//        if (url.startsWith("http")) {
//            System.out.println("This url use HTTPS protocol");
//        } else if (url.startsWith("https")) {
//            System.out.println("This url use HTTPS protocol");
//
//
//        } if (url.endsWith(".com")) {
//            System.out.println("The domain name of this URL is .com");
//        } else if (url.endsWith(".net")) {
//            System.out.println("The domain name of this URL is .net");
//        }
//    }
//
//    }

  }


