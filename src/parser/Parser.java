package parser;

import java.io.File;
import java.io.FileWriter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Parser {
  public static void main(String[] args) throws Exception {
    //
    // Document doc =
    // Jsoup.connect("http://terms.naver.com/entry.nhn?docId=745060&cid=42478&categoryId=42482").get();
    //
    // String nameKor = doc.select("h2").text();
    // // String nameEng = doc.select("span[class=en]").text();
    //
    // String imgSrc = doc.select("img[id*=innerImage0]").attr("data-src");
    // boolean hasImg =
    // doc.select("img[id*=innerImage0]").hasAttr("data-src");
    // String content = doc.select("p[class=txt]").text();
    //
    // // String md = "* ### "+nameKor+"("+nameEng+")
    // // \n\r"+"\t![image]["+nameKor+"] \n\r"+"\t특징"+" "+content+"\n\r\n\r
    // ";
    // String md = "* ### " + nameKor + "\n\r" + "\t![image][" + nameKor +
    // "] \n\r" + "\t특징" + " " + content
    // + "\n\r\n\r ";
    // String md2 = "* ### " + nameKor + "\n\r" + "\t특징" + " " + content +
    // "\n\r\n\r ";
    // String mdSrc = "[" + nameKor + "]:" + imgSrc;
    // File file = new File("dino.md");
    // FileWriter fw = new FileWriter(file);
    //
    // if (hasImg == true) {
    // fw.write(md);
    //
    // } else {
    // fw.write(md2);
    // }
    //
    // fw.close();
    // System.out.println(md);
    File file = new File("django_docs_list.md");
    FileWriter fw = new FileWriter(file);
    int pageNum = 1;
    //for (int i = 0; i < 41; i++) {
      //String url = "http://terms.naver.com/list.nhn?cid=42478&page=" + pageNum + "&categoryId=42482";
      //String url = "http://terms.naver.com/list.nhn?cid=46677&page=" + pageNum + "&categoryId=46677";
      String url = "https://docs.djangoproject.com/en/1.10/ref/models/fields/#field-types";
      
      
      
      //String[] list = new String[15 * 41];
      Document doc = Jsoup.connect(url).get();
      //Elements els = doc.select("ul[class=thmb_lst] li dl dt a:first-child");
      //Elements els = doc.select("ul[class=thmb_lst] li dl dt a:first-child");
      //for (int j = 0; j < els.size(); j++) {
        //String listUrl = els.get(j).attr("href");

        // System.out.println(""+listUrl);
        // list.add("http://terms.naver.com" + listUrl);
        // list[j]="http://terms.naver.com" + listUrl;
        // System.out.println(list[j]);

        //String pageUrl = "http://terms.naver.com" + listUrl;

        //doc = Jsoup.connect(pageUrl).get();
        //String nameKor = doc.select("h2").text();
        // String nameEng = doc.select("span[class=en]").text();
      	
      	String h2 = doc.select("h2").text();
      	String h3 = doc.select("h3>code>span.pre").text();
      	String h4 = doc.select("code.descname").text();
      	boolean hasLine = doc.hasClass(".section");
      	
      	String h2Md = "## "+h2+"\n";
      	String h3Md = "### "+h3+"\n";
      	String h4Md = "#### "+h4+"\n";
      	String line = "";
      	if(hasLine){
      		line = "---\n";
      	}
        //String imgSrc = doc.select("img[id*=innerImage0]").attr("data-src");
        //boolean hasImg = doc.select("img[id*=innerImage0]").hasAttr("data-src");
        //String content = doc.select("p[class=txt]").text();

        // String md = "* ### "+nameKor+"("+nameEng+")
        // \n\r"+"\t![image]["+nameKor+"] \n\r"+"\t특징"+"
        // "+content+"\n\r\n\r";

        //String md = "\n\r* ### " + nameKor + "\n\r" + "\t![image][" + nameKor + "] \n\r" + "\t특징" + " " + content + "\n\r\n\r "
            //+ "\n\r\n\r ";

        //String md2 = "\n\r* ### " + nameKor + "\n\r" + "\t특징" + " " + content + "\n\r\n\r ";

        //String mdSrc = "[" + nameKor + "]:" + imgSrc + "\n\r\n\r ";


        //if (hasImg == true) {
          fw.write(h2Md);
          fw.write(h3Md);
          fw.write(h4Md);
          fw.write(line);
          
        //} else {
          //fw.write(md2);
        //}

      //}
      System.out.println("**************" + pageNum + "장 완료***************");
      pageNum++;
    //}
    
    
    fw.close();
    System.out.println("완료!");
  }
}