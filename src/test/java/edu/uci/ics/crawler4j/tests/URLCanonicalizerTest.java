package edu.uci.ics.crawler4j.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.uci.ics.crawler4j.url.URLCanonicalizer;

public class URLCanonicalizerTest {

  @Test
  public void testCanonizalier() {

//    assertEquals("http://www.example.com/display?category=foo%2Fbar%2Bbaz",
//                 URLCanonicalizer.getCanonicalURL("http://www.example.com/display?category=foo/bar+baz"));
//
//    assertEquals("http://www.example.com/?q=a%2Bb", URLCanonicalizer.getCanonicalURL("http://www.example.com/?q=a+b"));
//
//    assertEquals("http://www.example.com/display?category=foo%2Fbar%2Bbaz",
//                 URLCanonicalizer.getCanonicalURL("http://www.example.com/display?category=foo%2Fbar%2Bbaz"));
//
//    assertEquals("http://somedomain.com/uploads/1/0/2/5/10259653/6199347.jpg?1325154037", URLCanonicalizer
//                     .getCanonicalURL("http://somedomain.com/uploads/1/0/2/5/10259653/6199347.jpg?1325154037"));
//
//    assertEquals("http://hostname.com/", URLCanonicalizer.getCanonicalURL("http://hostname.com"));
//
//    assertEquals("http://hostname.com/", URLCanonicalizer.getCanonicalURL("http://HOSTNAME.com"));
//
//    assertEquals("http://www.example.com/index.html",
//                 URLCanonicalizer.getCanonicalURL("http://www.example.com/index.html?&"));
//
//    assertEquals("http://www.example.com/index.html",
//                 URLCanonicalizer.getCanonicalURL("http://www.example.com/index.html?"));
//
//    assertEquals("http://www.example.com/", URLCanonicalizer.getCanonicalURL("http://www.example.com"));
//
//    assertEquals("http://www.example.com/bar.html",
//                 URLCanonicalizer.getCanonicalURL("http://www.example.com:80/bar.html"));
//
//    assertEquals("http://www.example.com/index.html?name=test&rame=base",
//                 URLCanonicalizer.getCanonicalURL("http://www.example.com/index.html?name=test&rame=base#123"));
//
//    assertEquals("http://www.example.com/~username/",
//                 URLCanonicalizer.getCanonicalURL("http://www.example.com/%7Eusername/"));
//
//    assertEquals("http://www.example.com/A/B/index.html",
//                 URLCanonicalizer.getCanonicalURL("http://www.example.com//A//B/index.html"));
//
//    assertEquals("http://www.example.com/index.html?x=y",
//                 URLCanonicalizer.getCanonicalURL("http://www.example.com/index.html?&x=y"));
//
//    assertEquals("http://www.example.com/a.html",
//                 URLCanonicalizer.getCanonicalURL("http://www.example.com/../../a.html"));
//
//    assertEquals("http://www.example.com/a/c/d.html",
//                 URLCanonicalizer.getCanonicalURL("http://www.example.com/../a/b/../c/./d.html"));
//
//    assertEquals("http://foo.bar.com/?baz=1", URLCanonicalizer.getCanonicalURL("http://foo.bar.com?baz=1"));
//
//    assertEquals("http://www.example.com/index.html?a=b&c=d&e=f",
//                 URLCanonicalizer.getCanonicalURL("http://www.example.com/index.html?&c=d&e=f&a=b"));
//
//    assertEquals("http://www.example.com/index.html?q=a%20b",
//                 URLCanonicalizer.getCanonicalURL("http://www.example.com/index.html?q=a b"));
//
//    assertEquals("http://www.example.com/search?height=100%&width=100%",
//                 URLCanonicalizer.getCanonicalURL("http://www.example.com/search?width=100%&height=100%"));
//
//    assertEquals("http://foo.bar/mydir/myfile?page=2",
//                 URLCanonicalizer.getCanonicalURL("?page=2", "http://foo.bar/mydir/myfile"));
	  
	  
//	  String url = "http://s.taobao.com/list?spm=a219r.lm0.a214d9w-static.2.5bFP5w&q=%C6%BD%B0%E5%B5%E7%CA%D3&commend=all&ssid=s5-e&search_type=item&sourceId=tb.index&initiative_id=tbindexz_20140910&from_type=jiadian";
//
//	  System.out.println(url);
//	  System.out.println(URLCanonicalizer.getCanonicalURL(url));
//	  
//	  String url2 = "http://www.example.com/display?category=%C6%BD%B0%E5%B5%E7%CA%D3";
//
//	  System.out.println(url2);
//	  System.out.println(URLCanonicalizer.getCanonicalURL(url2));
	  
	  
		  
//	  String url2 = "http://list.suning.com/0-330503-0-0-0-9051.html#sourceUrl4Sa=http://binggo.suning.com/hufu.html";
//
//	  System.out.println(url2);
//	  System.out.println(URLCanonicalizer.getCanonicalURL(url2));
	  
	  String url2 = "http://list.yhd.com/c6638-0/?tp=15.11065531.561.0.4.KlZ`Umt-10-C^Xue";

	  System.out.println(url2);
	  System.out.println(URLCanonicalizer.getCanonicalURL(url2));
	  
	  
  }
}