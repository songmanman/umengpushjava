/**
 *****************************************************************************************************************************************************************************
 * 
 * @author :fengguangjing
 * @createTime:2017-6-7下午5:42:52
 * @version:4.2.4
 * @modifyTime:
 * @modifyAuthor:
 * @description:
 *****************************************************************************************************************************************************************************
 */
package com.open.mmjpg.jsoup;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 ***************************************************************************************************************************************************************************** 
 * 
 * @author :fengguangjing
 * @createTime:2017-6-7下午5:42:52
 * @version:4.2.4
 * @modifyTime:
 * @modifyAuthor:
 * @description:
 ***************************************************************************************************************************************************************************** 
 */
public class MeitziuJsoupService {
	public static final String TAG=MeitziuJsoupService.class.getSimpleName();
	public static List<PCMainBean> parsepcpicnew(String href, int pageNo) {
		List<PCMainBean> list = new ArrayList<PCMainBean>();
		try {
			// href = makeURL(href, new HashMap<String, Object>() {
			// {
			// }
			// });
			Document doc;
			doc = Jsoup.connect(href).userAgent(UrlUtils.userAgent).timeout(10000).get();
			System.out.println(TAG+ "url = " + href);

//			Document doc = Jsoup.connect(href).userAgent(UrlUtils.userAgent).timeout(10000).get();
			// System.out.println(doc.toString());
			try {
				/**
				 */
				 Element globalnavElement =  doc.select("div.picnew").first();
				Elements moduleElements = globalnavElement.select("li");
				if (moduleElements != null && moduleElements.size() > 0) {
					for (int i = 0; i < moduleElements.size(); i++) {
						 
						PCMainBean sbean = new PCMainBean();
							try {
								try {
									Element aElement = moduleElements.get(i).select("a").first();
									if (aElement != null) {
										String hrefa = aElement.attr("href");
										System.out.println(TAG+ "i==" + i + ";hrefa==" + hrefa);
										sbean.setHref(hrefa);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}

								 
								try {
									Element imgElement = moduleElements.get(i).select("img").first();
									if (imgElement != null) {
										String src = imgElement.attr("src");
										System.out.println(TAG+ "i==" + i + ";src==" + src);
										sbean.setSrc(src);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}

								 
								try {
									Element imgElement = moduleElements.get(i).select("img").first();
									if (imgElement != null) {
										String alt = imgElement.attr("alt");
										System.out.println(TAG+ "i==" + i + ";alt==" + alt);
										sbean.setAlt(alt);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}
 

							} catch (Exception e) {
								e.printStackTrace();
							}

							list.add(sbean);
						}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static List<PCMainBean> parsepctags(String href, int pageNo) {
		List<PCMainBean> list = new ArrayList<PCMainBean>();
		try {
			// href = makeURL(href, new HashMap<String, Object>() {
			// {
			// }
			// });
			Document doc;
			doc = Jsoup.connect(href).userAgent(UrlUtils.userAgent).timeout(10000).get();
			System.out.println(TAG+ "url = " + href);

//			Document doc = Jsoup.connect(href).userAgent(UrlUtils.userAgent).timeout(10000).get();
			// System.out.println(doc.toString());
			try {
				/**
				 */
				 Element globalnavElement =  doc.select("div.tags").first();
				Elements moduleElements = globalnavElement.select("a");
				if (moduleElements != null && moduleElements.size() > 0) {
					for (int i = 0; i < moduleElements.size(); i++) {
						 
						PCMainBean sbean = new PCMainBean();
							try {
								try {
									Element aElement = moduleElements.get(i).select("a").first();
									if (aElement != null) {
										String hrefa = aElement.attr("href");
										System.out.println(TAG+ "i==" + i + ";hrefa==" + hrefa);
										sbean.setHref(hrefa);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}
								 
								try {
									Element imgElement = moduleElements.get(i).select("a").first();
									if (imgElement != null) {
										String alt = imgElement.text();
										System.out.println(TAG+ "i==" + i + ";alt==" + alt);
										sbean.setAlt(alt);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}

							} catch (Exception e) {
								e.printStackTrace();
							}

							list.add(sbean);
						}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static List<PCMainBean> parsepchotpic(String href, int pageNo) {
		List<PCMainBean> list = new ArrayList<PCMainBean>();
		try {
			// href = makeURL(href, new HashMap<String, Object>() {
			// {
			// }
			// });
			Document doc;
			doc = Jsoup.connect(href).userAgent(UrlUtils.userAgent).timeout(10000).get();
			System.out.println(TAG+ "url = " + href);

//			Document doc = Jsoup.connect(href).userAgent(UrlUtils.userAgent).timeout(10000).get();
			// System.out.println(doc.toString());
			try {
				/**
				 */
				 Element globalnavElement =  doc.select("div.hotpic").first();
				Elements moduleElements = globalnavElement.select("li");
				if (moduleElements != null && moduleElements.size() > 0) {
					for (int i = 0; i < moduleElements.size(); i++) {
						PCMainBean sbean = new PCMainBean();
							try {
								try {
									Element aElement = moduleElements.get(i).select("a").first();
									if (aElement != null) {
										String hrefa = aElement.attr("href");
										System.out.println(TAG+ "i==" + i + ";hrefa==" + hrefa);
										sbean.setHref(hrefa);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}
								 
								try {
									Element imgElement = moduleElements.get(i).select("img").first();
									if (imgElement != null) {
										String src = imgElement.attr("src");
										System.out.println(TAG+ "i==" + i + ";src==" + src);
										sbean.setSrc(src);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}
								
								try {
									Element aElement = moduleElements.get(i).select("img").first();
									if (aElement != null) {
										String alt = aElement.attr("alt");
										System.out.println(TAG+ "i==" + i + ";alt==" + alt);
										sbean.setAlt(alt);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}

							} catch (Exception e) {
								e.printStackTrace();
							}

							list.add(sbean);
						}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	 
	
	public static List<PCMainBean> parsepclastest(String href, int pageNo) {
		List<PCMainBean> list = new ArrayList<PCMainBean>();
		try {
			// href = makeURL(href, new HashMap<String, Object>() {
			// {
			// }
			// });
			Document doc;
			doc = Jsoup.connect(href).userAgent(UrlUtils.userAgent).timeout(10000).get();
			System.out.println(TAG+ "url = " + href);

//			Document doc = Jsoup.connect(href).userAgent(UrlUtils.userAgent).timeout(10000).get();
			// System.out.println(doc.toString());
			try {
				/**
				 */
				 Element globalnavElement =  doc.select("div.lastest").first();
				Elements moduleElements = globalnavElement.select("li");
				if (moduleElements != null && moduleElements.size() > 0) {
					for (int i = 0; i < moduleElements.size(); i++) {
						PCMainBean sbean = new PCMainBean();
							try {
								try {
									Element aElement = moduleElements.get(i).select("a").first();
									if (aElement != null) {
										String hrefa = aElement.attr("href");
										System.out.println(TAG+ "i==" + i + ";hrefa==" + hrefa);
										sbean.setHref(hrefa);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}
								 
								
								try {
									Element aElement = moduleElements.get(i).select("a").first();
									if (aElement != null) {
										String alt = aElement.text();
										System.out.println(TAG+ "i==" + i + ";alt==" + alt);
										sbean.setAlt(alt);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}

							} catch (Exception e) {
								e.printStackTrace();
							}

							list.add(sbean);
						}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static List<PCMainBean> parsepcflinkTag(String href, int pageNo) {
		List<PCMainBean> list = new ArrayList<PCMainBean>();
		try {
			// href = makeURL(href, new HashMap<String, Object>() {
			// {
			// }
			// });
			Document doc;
			doc = Jsoup.connect(href).userAgent(UrlUtils.userAgent).timeout(10000).get();
			System.out.println(TAG+ "url = " + href);

//			Document doc = Jsoup.connect(href).userAgent(UrlUtils.userAgent).timeout(10000).get();
			// System.out.println(doc.toString());
			try {
				/**
				 */
				 Element globalnavElement =  doc.select("div.flinkTag").first();
				Elements moduleElements = globalnavElement.select("li");
				if (moduleElements != null && moduleElements.size() > 0) {
					for (int i = 0; i < moduleElements.size(); i++) {
						PCMainBean sbean = new PCMainBean();
							try {
								try {
								   sbean.setHref(href);
								} catch (Exception e) {
									e.printStackTrace();
								}
								 
								
								try {
									Element aElement = moduleElements.get(i).select("li").first();
									if (aElement != null) {
										String alt = aElement.text();
										System.out.println(TAG+ "i==" + i + ";alt==" + alt);
										sbean.setAlt(alt);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}

							} catch (Exception e) {
								e.printStackTrace();
							}

							list.add(sbean);
						}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static List<PCMainBean> parsepcflink(String href, int pageNo) {
		List<PCMainBean> list = new ArrayList<PCMainBean>();
		try {
			// href = makeURL(href, new HashMap<String, Object>() {
			// {
			// }
			// });
			Document doc;
			doc = Jsoup.connect(href).userAgent(UrlUtils.userAgent).timeout(10000).get();
			System.out.println(TAG+ "url = " + href);

//			Document doc = Jsoup.connect(href).userAgent(UrlUtils.userAgent).timeout(10000).get();
			// System.out.println(doc.toString());
			try {
				/**
				 */
				 Element globalnavElement =  doc.select("div.flink").get(pageNo);
				Elements moduleElements = globalnavElement.select("a");
				if (moduleElements != null && moduleElements.size() > 0) {
					for (int i = 0; i < moduleElements.size(); i++) {
						PCMainBean sbean = new PCMainBean();
							try {
								try {
									Element aElement = moduleElements.get(i).select("a").first();
									if (aElement != null) {
										String hrefa = aElement.attr("href");
										System.out.println(TAG+ "i==" + i + ";hrefa==" + hrefa);
										sbean.setHref(hrefa);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}
								 
								
								try {
									Element aElement = moduleElements.get(i).select("a").first();
									if (aElement != null) {
										String alt = aElement.text();
										System.out.println(TAG+ "i==" + i + ";alt==" + alt);
										sbean.setAlt(alt);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}

							} catch (Exception e) {
								e.printStackTrace();
							}

							list.add(sbean);
						}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	public static List<PCMainBean> parsepcmaincontent(String href, int pageNo) {
		List<PCMainBean> list = new ArrayList<PCMainBean>();
		try {
			// href = makeURL(href, new HashMap<String, Object>() {
			// {
			// }
			// });
			Document doc;
			doc = Jsoup.connect(href).userAgent(UrlUtils.userAgent).timeout(10000).get();
			System.out.println(TAG+ "url = " + href);

//			Document doc = Jsoup.connect(href).userAgent(UrlUtils.userAgent).timeout(10000).get();
			// System.out.println(doc.toString());
			try {
				/**
				 */
//				 Element globalnavElement =  doc.select("div.flink").first();
				Elements moduleElements = doc.select("div.postmeta");
				if (moduleElements != null && moduleElements.size() > 0) {
					for (int i = 0; i < moduleElements.size(); i++) {
						PCMainBean sbean = new PCMainBean();
							try {
								try {
									Element aElement = moduleElements.get(i).select("a").first();
									if (aElement != null) {
										String hrefa = aElement.attr("href");
										System.out.println(TAG+ "i==" + i + ";hrefa==" + hrefa);
										sbean.setHref(hrefa);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}
								 
								
								try {
									Element aElement = moduleElements.get(i).select("div.metaRight").first();
									if (aElement != null) {
										String title = aElement.text();
										System.out.println(TAG+ "i==" + i + ";title==" + title);
										sbean.setTitle(title);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}
								
								try {
									Element aElement = moduleElements.get(i).select("div.metaLeft").first();
									if (aElement != null) {
										String alt = aElement.text();
										System.out.println(TAG+ "i==" + i + ";alt==" + alt);
										sbean.setAlt(alt);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}
								
								try {
									Element aElement = moduleElements.get(i).nextElementSibling();
									if (aElement != null) {
										String src = aElement.select("img").first().attr("src");
										System.out.println(TAG+ "i==" + i + ";src==" + src);
										sbean.setSrc(src);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}
								
								//分页navigation
								try {
									Element aElement = doc.select("div.navigation").first();
									if (aElement != null) {
										Element liElement = aElement.select("li.thisclass").first();
										String pagenumbers = liElement.nextElementSibling().select("a").first().attr("href");
										System.out.println(TAG+ "i==" + i + ";pagenumbers==" + pagenumbers);
										sbean.setPagenumbers(pagenumbers);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}

							} catch (Exception e) {
								e.printStackTrace();
							}

							list.add(sbean);
						}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	 
	public static List<PCMainBean> parsepcmainmore(String href, int pageNo) {
		List<PCMainBean> list = new ArrayList<PCMainBean>();
		try {
			// href = makeURL(href, new HashMap<String, Object>() {
			// {
			// }
			// });
			Document doc;
			doc = Jsoup.connect(href).userAgent(UrlUtils.userAgent).timeout(10000).get();
			System.out.println(TAG+ "url = " + href);

//			Document doc = Jsoup.connect(href).userAgent(UrlUtils.userAgent).timeout(10000).get();
			// System.out.println(doc.toString());
			try {
				/**
				 */
				 Element globalnavElement =  doc.select("ul.wp-list").first();
				Elements moduleElements = globalnavElement.select("li.wp-item");
				if (moduleElements != null && moduleElements.size() > 0) {
					for (int i = 0; i < moduleElements.size(); i++) {
						PCMainBean sbean = new PCMainBean();
							try {
								try {
									Element aElement = moduleElements.get(i).select("a").first();
									if (aElement != null) {
										String hrefa = aElement.attr("href");
										System.out.println(TAG+ "i==" + i + ";hrefa==" + hrefa);
										sbean.setHref(hrefa);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}
								 
								
								try {
									Element aElement = moduleElements.get(i).select("img").first();
									if (aElement != null) {
										String title = aElement.attr("alt");
										System.out.println(TAG+ "i==" + i + ";title==" + title);
										sbean.setTitle(title);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}
								
								try {
									Element aElement = moduleElements.get(i).select("img").first();
									if (aElement != null) {
										String src = aElement.select("img").first().attr("src");
										System.out.println(TAG+ "i==" + i + ";src==" + src);
										sbean.setSrc(src);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}
								
								//分页navigation
								try {
									Element aElement = doc.select("div.navigation").first();
									if (aElement != null) {
										Element liElement = aElement.select("li.thisclass").first();
										String pagenumbers = liElement.nextElementSibling().select("a").first().attr("href");
										System.out.println(TAG+ "i==" + i + ";pagenumbers==" + pagenumbers);
										sbean.setPagenumbers(pagenumbers);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}

							} catch (Exception e) {
								e.printStackTrace();
							}

							list.add(sbean);
						}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static List<PCMainBean> parsepcimagelist(String href, int pageNo) {
		List<PCMainBean> list = new ArrayList<PCMainBean>();
		try {
			// href = makeURL(href, new HashMap<String, Object>() {
			// {
			// }
			// });
			Document doc;
			doc = Jsoup.connect(href).userAgent(UrlUtils.userAgent).timeout(10000).get();
			System.out.println(TAG+ "url = " + href);

//			Document doc = Jsoup.connect(href).userAgent(UrlUtils.userAgent).timeout(10000).get();
			// System.out.println(doc.toString());
			try {
				/**
				 */
				 Element globalnavElement =  doc.select("div.postContent").first();
				Elements moduleElements = globalnavElement.select("img");
				if (moduleElements != null && moduleElements.size() > 0) {
					for (int i = 0; i < moduleElements.size(); i++) {
						PCMainBean sbean = new PCMainBean();
							try {
								try {
									sbean.setHref(href);
								} catch (Exception e) {
									e.printStackTrace();
								}
								try {
									Element aElement = doc.select("div.postmeta").first();
									if (aElement != null) {
										String title = aElement.text();
										System.out.println(TAG+ "i==" + i + ";title==" + title);
										sbean.setTitle(title);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}
								
								try {
										String other = globalnavElement.text();
										System.out.println(TAG+ "i==" + i + ";other==" + other);
										sbean.setOther(other);
								} catch (Exception e) {
									e.printStackTrace();
								}
								
								try {
									Element aElement = moduleElements.get(i).select("img").first();
									if (aElement != null) {
										String alt = aElement.attr("alt");
										System.out.println(TAG+ "i==" + i + ";alt==" + alt);
										sbean.setAlt(alt);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}
								
								try {
									Element aElement = moduleElements.get(i).select("img").first();
									if (aElement != null) {
										String src = aElement.attr("src");
										System.out.println(TAG+ "i==" + i + ";src==" + src);
										sbean.setSrc(src);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}

							} catch (Exception e) {
								e.printStackTrace();
							}
							list.add(sbean);
						}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static List<PCMainBean> parsepcimagerelatedpost(String href, int pageNo) {
		List<PCMainBean> list = new ArrayList<PCMainBean>();
		try {
			// href = makeURL(href, new HashMap<String, Object>() {
			// {
			// }
			// });
			Document doc;
			doc = Jsoup.connect(href).userAgent(UrlUtils.userAgent).timeout(10000).get();
			System.out.println(TAG+ "url = " + href);

//			Document doc = Jsoup.connect(href).userAgent(UrlUtils.userAgent).timeout(10000).get();
			// System.out.println(doc.toString());
			try {
				/**
				 */
				 Element globalnavElement =  doc.select("ul.related_post").first();
				Elements moduleElements = globalnavElement.select("li");
				if (moduleElements != null && moduleElements.size() > 0) {
					for (int i = 0; i < moduleElements.size(); i++) {
						PCMainBean sbean = new PCMainBean();
							try {
								
								try {
									Element aElement = moduleElements.get(i).select("a").first();
									if (aElement != null) {
										String alt = aElement.text();
										System.out.println(TAG+ "i==" + i + ";alt==" + alt);
										sbean.setAlt(alt);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}
								
								try {
									Element aElement = moduleElements.get(i).select("a").first();
									if (aElement != null) {
										String hrefa = aElement.attr("href");
										System.out.println(TAG+ "i==" + i + ";hrefa==" + hrefa);
										sbean.setHref(hrefa);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}

							} catch (Exception e) {
								e.printStackTrace();
							}
							list.add(sbean);
						}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * m 左菜单
	 */
	public static List<PCMainBean> parsemmenu(String href, int pageNo) {
		List<PCMainBean> list = new ArrayList<PCMainBean>();
		try {
			// href = makeURL(href, new HashMap<String, Object>() {
			// {
			// }
			// });
			Document doc;
			doc = Jsoup.connect(href).userAgent(UrlUtils.userAgent).timeout(10000).get();
			System.out.println(TAG+ "url = " + href);

//			Document doc = Jsoup.connect(href).userAgent(UrlUtils.userAgent).timeout(10000).get();
			// System.out.println(doc.toString());
			try {
				/**
				 */
				 Element globalnavElement =  doc.select("ul.am-menu-nav").first();
				Elements moduleElements = globalnavElement.select("a");
				if (moduleElements != null && moduleElements.size() > 0) {
					for (int i = 0; i < moduleElements.size(); i++) {
						PCMainBean sbean = new PCMainBean();
							try {
								
								try {
									Element aElement = moduleElements.get(i).select("a").first();
									if (aElement != null) {
										String alt = aElement.text();
										System.out.println(TAG+ "i==" + i + ";alt==" + alt);
										sbean.setAlt(alt);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}
								
								try {
									Element aElement = moduleElements.get(i).select("a").first();
									if (aElement != null) {
										String hrefa = aElement.attr("href");
										System.out.println(TAG+ "i==" + i + ";hrefa==" + hrefa);
										sbean.setHref(hrefa);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}

							} catch (Exception e) {
								e.printStackTrace();
							}
							list.add(sbean);
						}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	 
	public static List<PCMainBean> parsemmainlist(String href, int pageNo) {
		List<PCMainBean> list = new ArrayList<PCMainBean>();
		try {
			// href = makeURL(href, new HashMap<String, Object>() {
			// {
			// }
			// });
			Document doc;
			doc = Jsoup.connect(href).userAgent(UrlUtils.userAgent).timeout(10000).get();
			System.out.println(TAG+ "url = " + href);

//			Document doc = Jsoup.connect(href).userAgent(UrlUtils.userAgent).timeout(10000).get();
			// System.out.println(doc.toString());
			try {
				/**
				 */
				 Element globalnavElement =  doc.select("ul.am-avg-sm-1").first();
				Elements moduleElements = globalnavElement.select("li");
				if (moduleElements != null && moduleElements.size() > 0) {
					for (int i = 0; i < moduleElements.size(); i++) {
						PCMainBean sbean = new PCMainBean();
							try {
								
								try {
									Element aElement = moduleElements.get(i).select("img").first();
									if (aElement != null) {
										String alt = aElement.attr("alt");
										System.out.println(TAG+ "i==" + i + ";alt==" + alt);
										sbean.setAlt(alt);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}
								
								try {
									Element aElement = moduleElements.get(i).select("a").first();
									if (aElement != null) {
										String hrefa = aElement.attr("href");
										System.out.println(TAG+ "i==" + i + ";hrefa==" + hrefa);
										sbean.setHref(hrefa);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}
								
								try {
									Element aElement = moduleElements.get(i).select("img").first();
									if (aElement != null) {
										String src = aElement.attr("data-original");
										System.out.println(TAG+ "i==" + i + ";src==" + src);
										sbean.setSrc(src);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}
								
								try {
									Element aElement = doc.select("a.am-list-news-more").first();
									if (aElement != null) {
										String pagenumbers = aElement.attr("href");
										System.out.println(TAG+ "i==" + i + ";pagenumbers==" + pagenumbers);
										sbean.setPagenumbers(pagenumbers);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}
								

							} catch (Exception e) {
								e.printStackTrace();
							}
							list.add(sbean);
						}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static List<PCMainBean> parsemlastest(String href, int pageNo) {
		List<PCMainBean> list = new ArrayList<PCMainBean>();
		try {
			// href = makeURL(href, new HashMap<String, Object>() {
			// {
			// }
			// });
			Document doc;
			doc = Jsoup.connect(href).userAgent(UrlUtils.userAgent).timeout(10000).get();
			System.out.println(TAG+ "url = " + href);

//			Document doc = Jsoup.connect(href).userAgent(UrlUtils.userAgent).timeout(10000).get();
			// System.out.println(doc.toString());
			try {
				/**
				 */
				 Element globalnavElement =  doc.select("ul.am-avg-sm-2").first();
				Elements moduleElements = globalnavElement.select("li");
				if (moduleElements != null && moduleElements.size() > 0) {
					for (int i = 0; i < moduleElements.size(); i++) {
						PCMainBean sbean = new PCMainBean();
							try {
								
								try {
									Element aElement = moduleElements.get(i).select("img").first();
									if (aElement != null) {
										String alt = aElement.attr("alt");
										System.out.println(TAG+ "i==" + i + ";alt==" + alt);
										sbean.setAlt(alt);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}
								
								try {
									Element aElement = moduleElements.get(i).select("a").first();
									if (aElement != null) {
										String hrefa = aElement.attr("href");
										System.out.println(TAG+ "i==" + i + ";hrefa==" + hrefa);
										sbean.setHref(hrefa);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}
								
								try {
									Element aElement = moduleElements.get(i).select("img").first();
									if (aElement != null) {
										String src = aElement.attr("data-original");
										System.out.println(TAG+ "i==" + i + ";src==" + src);
										sbean.setSrc(src);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}
								
								 
									try {
										Element aElement = doc.select("a.am-list-news-more").first();
										if (aElement != null) {
											String pagenumbers = aElement.attr("href");
											System.out.println(TAG+ "i==" + i + ";pagenumbers==" + pagenumbers);
											sbean.setPagenumbers(pagenumbers);
										}
									} catch (Exception e) {
										e.printStackTrace();
									}
								 
									try {
										Element aElement = doc.select("div.am-list-news-ft").first();
										if (aElement != null) {
											Elements liElements = aElement.select("li");
											for(int j=0;j<liElements.size();j++){
												Element liElement = liElements.get(j);
												if("下一页".equals(liElement.text())){
													String pagenumbers = liElement.select("a").first().attr("href");
													System.out.println(TAG+ "i==" + i + ";pagenumbers==" + pagenumbers);
													sbean.setPagenumbers(pagenumbers);
													break;
												}
											}
										}
									} catch (Exception e) {
										e.printStackTrace();
									}
								 

							} catch (Exception e) {
								e.printStackTrace();
							}
							list.add(sbean);
						}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static List<PCMainBean> parsemtuijian(String href, int pageNo) {
		List<PCMainBean> list = new ArrayList<PCMainBean>();
		try {
			// href = makeURL(href, new HashMap<String, Object>() {
			// {
			// }
			// });
			Document doc;
			doc = Jsoup.connect(href).userAgent(UrlUtils.userAgent).timeout(10000).get();
			System.out.println(TAG+ "url = " + href);

//			Document doc = Jsoup.connect(href).userAgent(UrlUtils.userAgent).timeout(10000).get();
			// System.out.println(doc.toString());
			try {
				/**
				 */
				 Element globalnavElement =  doc.select("div.am-list-news-bd").first();
				Elements moduleElements = globalnavElement.select("li");
				if (moduleElements != null && moduleElements.size() > 0) {
					for (int i = 0; i < moduleElements.size(); i++) {
						PCMainBean sbean = new PCMainBean();
							try {
								
								try {
									Element aElement = moduleElements.get(i).select("img").first();
									if (aElement != null) {
										String alt = aElement.attr("alt");
										System.out.println(TAG+ "i==" + i + ";alt==" + alt);
										sbean.setAlt(alt);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}
								
								try {
									Element aElement = moduleElements.get(i).select("a").first();
									if (aElement != null) {
										String hrefa = aElement.attr("href");
										System.out.println(TAG+ "i==" + i + ";hrefa==" + hrefa);
										sbean.setHref(hrefa);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}
								
								try {
									Element aElement = moduleElements.get(i).select("img").first();
									if (aElement != null) {
										String src = aElement.attr("data-original");
										System.out.println(TAG+ "i==" + i + ";src==" + src);
										sbean.setSrc(src);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}

							} catch (Exception e) {
								e.printStackTrace();
							}
							list.add(sbean);
						}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * m 左菜单
	 */
	public static List<TpicNBean> parsemmenusub(String href, int pageNo) {
		List<TpicNBean> list = new ArrayList<TpicNBean>();
		try {
			// href = makeURL(href, new HashMap<String, Object>() {
			// {
			// }
			// });
			Document doc;
			doc = Jsoup.connect(href).userAgent(UrlUtils.userAgent).timeout(10000).get();
			System.out.println(TAG+ "url = " + href);

//			Document doc = Jsoup.connect(href).userAgent(UrlUtils.userAgent).timeout(10000).get();
			// System.out.println(doc.toString());
			try {
				 Element globalnavElement =  doc.select("ul.am-menu-nav").first();
				 Elements moduleElements = globalnavElement.children();
				 if (moduleElements != null && moduleElements.size() > 0) {
					for (int i = 0; i < moduleElements.size(); i++) {
						Element liElement = moduleElements.get(i);
						if(liElement.attr("class").contains("am-parent")){
							TpicNBean nbean = new TpicNBean();
							try {
								Element aElement = liElement.select("a").first();
								nbean.setTitle(aElement.text());
							} catch (Exception e) {
								// TODO: handle exception
							}
							
							try {
								Element ulElement = liElement.select("ul").first();
								Elements liElements = ulElement.select("li");
								List<PCMainBean> mlist = new ArrayList<PCMainBean>(); 
								for(int j=0;j<liElements.size();j++){
									PCMainBean mbean = new PCMainBean();
									try {
										Element aElement = liElements.get(j).select("a").first();
										mbean.setHref(aElement.attr("href"));
									} catch (Exception e) {
										// TODO: handle exception
									}
									
									try {
										Element aElement = liElements.get(j).select("a").first();
										mbean.setAlt(aElement.text());
									} catch (Exception e) {
										// TODO: handle exception
									}
									mlist.add(mbean);
								}
								nbean.setList(mlist);
							} catch (Exception e) {
								 
							}
							list.add(nbean);
						}else{
							try {
								Elements liElements = liElement.select("a");
								for(int j=0;j<liElements.size();j++){
									TpicNBean nbean = new TpicNBean();
									try {
										Element aElement = liElements.get(j).select("a").first();
										nbean.setHref(aElement.attr("href"));
									} catch (Exception e) {
										// TODO: handle exception
									}
									
									try {
										Element aElement = liElements.get(j).select("a").first();
										nbean.setTitle(aElement.text());
									} catch (Exception e) {
										// TODO: handle exception
									}
									list.add(nbean);
								}
							} catch (Exception e) {
								 
							}
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
