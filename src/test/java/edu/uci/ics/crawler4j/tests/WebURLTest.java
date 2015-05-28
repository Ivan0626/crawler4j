package edu.uci.ics.crawler4j.tests;

import org.junit.Test;

import edu.uci.ics.crawler4j.url.WebURL;


/**
 * Created by Avi on 8/19/2014.
 *
 */
public class WebURLTest {

  @Test
  public void testNoLastSlash() {
    WebURL webUrl = new WebURL();
    webUrl.setURL("http://www.amazon.cn/s/ref=sr_nr_n_1?fst=as%3Aoff&rh=n%3A814224051%2Cn%3A814229051%2Cn%3A814351051&bbn=814229051&ie=UTF8&qid=1427531085&rnid=814229051&ajr=2");
  }
}