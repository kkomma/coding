//package abc.aa.options;
//
//import java.io.IOException;
//import java.net.SocketTimeoutException;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.List;
//
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//import org.springframework.util.StringUtils;
//
//
//public class ReadHtmlList {
//
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public static void main(String args[]) {
//
//		List listOfTickers = new ArrayList();
//		List listOfErrors = new ArrayList();
//
//		String src = null;
//		String ticker =null;
//
//		listOfTickers.add("WMT");		
//		listOfTickers.add("AKS");
//
//		boolean success = false;
//
//		for(int ii=1;ii<listOfTickers.size();ii++){
//
//			ticker = (String) listOfTickers.get(ii);
//			System.out.println("ticker::::"+ticker);
//
//			int j = 0;
//			if(null==src){
//
//				while( j < 3){
//
//					System.out.println("iteration j value::::"+j+1);
//
//					try {
//
//						String mainUrl = null;
//						mainUrl = "http://www.optionseducation.org/quotes.html?quote="+listOfTickers.get(0);
//
//						Document doc = null;
//						doc = Jsoup.connect(mainUrl)
//								.userAgent("Mozilla")
//								.timeout(60000)
//								.get();
//
//						Element iframe = doc.getElementsByTag("iframe").get(0);	
//						//src = iframe.attr("src");
//
//						src = iframe.attr("src");
//
//						System.out.println("SRC String is::::"+src);
//						src = StringUtils.delete(src,src.substring(src.lastIndexOf('&'),src.length()));
//						System.out.println("final src string is::::"+src);
//						success = true;
//						break;
//					} catch (SocketTimeoutException ex){
//						listOfErrors.add("FIRST");
//					}
//					catch (IOException e) {
//					}           
//					j++;
//				}
//			}
//
//			if(success){
//
//				String url = null;
//				url = src+"&ticker="+listOfTickers.get(ii)+"&exp_date=-2&value=go";	
//				System.out.println("final url:::"+url);
//
//				boolean success1 = false;
//				Document doc1 = null;
//
//				int k = 0;
//				while( k < 3){
//					System.out.println("iteration k value:::"+(k+1));
//
//					try {
//						doc1 = Jsoup.connect(url).maxBodySize(0)
//								.userAgent("Mozilla")
//								.timeout(120000)
//								.get();
//						success1 = true;
//						break;
//					} catch (SocketTimeoutException ex){			           
//						listOfErrors.add(listOfTickers.get(ii));
//					}
//					catch (IOException e) {
//					}           
//					k++;
//				}
//
//				if(success1){
//
//					Elements tables = doc1.select("table:gt(6)");				
//					int i=0;
//					int nooftables=0;
//					nooftables=tables.size();
//					System.out.println("no of tables::::"+nooftables);
//					String cmp=null;
//
//					List stkprice = null;
//					//System.out.println("elements are::::"+tables);
//					for(Element table:tables){
//
//						i=i+1;
//						if(1==i){
//
//							Elements trs1 = table.select("tr[bgcolor=#eeeeee]");
//
//
//							for (Element tr1 : trs1){
//
//								stkprice = new ArrayList();
//
//								stkprice.add(ticker);
//
//								if(tr1.hasText()){
//
//									Elements tds = tr1.getElementsByTag("td");
//
//									for (Element td:tds){
//
//										String formatstr = td.text().replaceAll(",", "");
//
//										System.out.println("formant str::::"+formatstr);
//
//										if(formatstr.isEmpty()){
//
//											System.out.println("this is empty value");											
//											stkprice.add("0.00");
//											stkprice.add("0.00");
//										}										
//										else if(formatstr.contains("+")&&formatstr.contains("%")){										
//
//											System.out.println("index + value:::"+formatstr.indexOf("+"));
//											System.out.println("( index is:::"+formatstr.indexOf("("));
//											String one = formatstr.substring(formatstr.indexOf("+"),formatstr.indexOf("(")-1);
//											String two = formatstr.substring(formatstr.indexOf("(")+1,formatstr.indexOf(")"));
//											two = two.replace("%","");
//											System.out.println("value kkkkkkk is:::"+StringUtils.trimAllWhitespace(one)
//											+":::"+StringUtils.trimAllWhitespace(two));
//
//											stkprice.add(StringUtils.trimAllWhitespace(one));
//											stkprice.add(StringUtils.trimAllWhitespace(two));
//
//										}
//										else if(formatstr.contains("-")&&formatstr.contains("%")){										
//
//											System.out.println("index - value:::"+formatstr.indexOf("-"));
//											System.out.println("( index is:::"+formatstr.indexOf("("));
//											String one = formatstr.substring(formatstr.indexOf("-"),formatstr.indexOf("(")-1);
//											String two = formatstr.substring(formatstr.indexOf("(")+1,formatstr.indexOf(")"));
//											two = two.replace("%","");
//											System.out.println("value kkkk is:::"+one+":::"+two);
//											System.out.println("value kkkkkkk is:::"+StringUtils.trimAllWhitespace(one)
//											+":::"+StringUtils.trimAllWhitespace(two));
//
//
//											stkprice.add(StringUtils.trimAllWhitespace(one));
//											stkprice.add(StringUtils.trimAllWhitespace(two));
//
//
//										}
//										else if(formatstr.contains("-")){
//
//											String one = formatstr.substring(0,formatstr.indexOf(".")+3);
//											String two = formatstr.substring(formatstr.indexOf("-")-2,formatstr.length());
//											System.out.println("date values are:::"+one+"::::"+two);
//
//											//26-Aug
//
//
//											SimpleDateFormat sdf2 = new SimpleDateFormat("YYYY");
//											SimpleDateFormat sdf3 = new SimpleDateFormat("MM");        
//
//											Calendar c2 = Calendar.getInstance();
//											String year = sdf2.format(c2.getTime());
//											String month = sdf3.format(c2.getTime());
//
//
//
//											two = two.concat("-"+year);
//
//											String expdatedb = null;
//											SimpleDateFormat fromUser1 = new SimpleDateFormat("dd-MMM-yyyy");  
//											SimpleDateFormat myFormat1 = new SimpleDateFormat("yyyy-MM-dd");
//
//											try {
//
//												expdatedb = myFormat1.format(fromUser1.parse(two));
//
//												SimpleDateFormat userformat = new SimpleDateFormat("yyyy-MM-dd");
//												SimpleDateFormat myformat = new SimpleDateFormat("MM");
//												String stockmonth = myformat.format(userformat.parse(expdatedb));
//
//												if(Integer.parseInt(stockmonth)<Integer.parseInt(month)){										        	 
//													System.out.println("stock month is greater than current month:::"+"sm:::"+stockmonth+"fdd::"+month);
//													String yearless = String.valueOf(Integer.parseInt(year)-1);
//													two = two.replace(year,yearless);
//													System.out.println(two+":::::");															
//												}
//
//												expdatedb = myFormat1.format(fromUser1.parse(two));
//
//											} catch (ParseException e) {
//												// TODO Auto-generated catch block
//												e.printStackTrace();
//											}
//
//											stkprice.add(one);
//											stkprice.add(expdatedb);
//
//										}												
//										else{
//											stkprice.add(formatstr);
//										}
//									}
//
//									cmp = tds.first().text().toString();
//									cmp = StringUtils.trimAllWhitespace(cmp);
//								}
//							}
//
//							System.out.println("stock price are:::::");
//
//							for(int y=0;y<stkprice.size();y++){
//								System.out.println(stkprice.get(y));
//							}
//
//						}
//
//
//
//						if(((!(3==i||1==i||nooftables==i))&&(1==i%2))){
//
//							System.out.println("table no::::"+i);
//							Elements trs = table.select("tr");
//
//							List<List> listOfList = new ArrayList<List>();			
//							List strike = new ArrayList();
//							List expiration = new ArrayList();
//							List opt = null;
//
//							for (Element tr : trs) {					
//
//								opt = new ArrayList();
//
//								if(tr.hasText()&&tr.childNodeSize()!=3){
//
//									System.out.print("row:"+tr.childNodeSize()+":::");
//									Elements tds = tr.getElementsByTag("td");
//
//									if(tds.first().text().toString().contains("Strike"))
//									{
//										System.out.print("skipping this row");
//									}
//									else{
//
//										for(Element td:tds){
//											if(td.hasText()){
//												if(!td.hasAttr("rowspan")){	
//
//													String s = td.text();
//													s= StringUtils.trimAllWhitespace(s);											
//
//													if(s.contains("--")){
//														s=s.replaceAll("--", "0.00");
//														opt.add(s);
//														System.out.print("||"+s);
//													}
//													else if(s.contains(",")){
//														s=s.replaceAll(",", "");
//														opt.add(s);
//														System.out.print("||"+s);
//													}
//													else if(s.contains("%")){
//														s=s.replaceAll("%", "");
//														opt.add(s);
//														System.out.print("||"+s);
//													}
//													else if(td.text().contains("(")){
//														s=s.substring(s.indexOf('(')+1, s.indexOf(')'));
//														opt.add(s);
//														System.out.print("||"+s);
//													}
//													else{											
//														opt.add(s);																															
//														System.out.print("||"+s);
//													}
//												}										
//												else{					
//													System.out.println("row span called");
//													strike.add(td.text());										
//													System.out.print("||"+td.text());								
//												}
//											}		
//
//										}
//
//										if(strike.size()>0){
//											System.out.println("");
//											System.out.print("shifting:::::::::::::::::strike siz"+strike.size());
//											opt.add(0,cmp);
//											opt.add(1,strike.get(strike.size()-1));
//											opt.add(2,expiration.get(expiration.size()-1));								
//										}
//
//									}
//
//								}
//								else if(tr.hasText()&&3==tr.childNodeSize()){
//
//									//System.out.println("iiiii value:::"+i);
//
//
//									Elements tds = tr.getElementsByTag("td");
//
//									String trims = tds.first().text().toString();
//
//									if(!trims.contains("Strike")){
//
//										System.out.println("String trims is::::"+trims);
//										String t = StringUtils.trimAllWhitespace(trims).replaceAll(" ","").replaceAll(",", "");							
//										//System.out.println("String t is::::"+t);		
//
//										String expdate = t.substring(7, 17);
//										System.out.println("expiration date is::::"+expdate);				
//
//
//										SimpleDateFormat fromUser1 = new SimpleDateFormat("MMMddyyyy");  
//										SimpleDateFormat myFormat1 = new SimpleDateFormat("yyyy-MM-dd");
//
//										try {
//											String expdatedb = myFormat1.format(fromUser1.parse(expdate));
//											expiration.add(expdatedb);								
//											//expiration.clear();
//										} catch (ParseException e) {
//											// TODO Auto-generated catch block
//											e.printStackTrace();
//										}
//
//									}
//								}
//
//
//								System.out.println("");
//								System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
//
//								/*
//				for(int m=0;m<opt.size();m++){
//					System.out.println("final string is::::"+opt.get(m));
//				}
//
//				for(int n=0;n<expiration.size();n++){
//					System.out.println("strike_expiration string is::::"+expiration.get(n));
//				}
//								 */
//
//								if(opt.size()>0){
//									listOfList.add(opt);
//									System.out.println("opt clear not called");
//								}
//
//
//							} //row level
//
//
//							opt.clear();
//							strike.clear();
//							expiration.clear();
//
//							for (int ll=0;ll<stkprice.size();ll++){
//								System.out.println("stkprice listtt:::"+stkprice.get(ll));
//							}
//
//
//
//							for (int ll=0;ll<listOfList.size();ll++){
//								System.out.println("OOOlist:::"+listOfList.get(ll));
//							}
//
//
//							System.out.println("List size to insert is:::"+listOfList.size());
//
//							if(listOfList.size()>0){
//								System.out.println("sucessfully NOT inserted the data into the database:::");
//								//JdbcTemplateApp passList = new JdbcTemplateApp();
//								//int ret = passList.main(listOfList,stkprice,ticker);
//								//System.out.println("sucessfully inserted the data into the database:::"+ret);
//								listOfList.clear();
//								stkprice.clear();
//							}
//
//						} // if loop after tables for
//
//					} // tables
//
//					/*
//Elements l1 = doc1.select("select.s2[name=exp_date] > option");
//for (Element j : l1) {
//		System.out.println("drop down values:::"+j.attr("value")+"||text::::"+j.text());
//}*/
//
//				} // checking if inner success1
//
//			} // if loop after for if
//
//		} // top for loop
//
//		System.out.println("done");
//		listOfTickers.clear();
//		listOfErrors.clear();
//
//	} // main method end
//
//}
//
///*
//	String content = readFile("test.txt", Charset.defaultCharset());
//	System.out.println(content);
//
//
//	     static String readFile(String path, Charset encoding)  throws IOException 
//			{
//			  byte[] encoded = Files.readAllBytes(Paths.get(path));
//			  return new String(encoded, encoding);
//			}
//
//}
//
//
//RL url = new URL("http://www.nseindia.com/content/equities/niftysparks.htm");
//Document doc = Jsoup.parse(url, 3000);
//
//Element table = doc.select("table[class=niftyd]").first();
//
//Iterator<Element> ite = table.select("td[width=65]").iterator();
//
//ite.next(); // first one is image, skip it
//
//System.out.println("Value 1: " + ite.next().text());
//System.out.println("Value 2: " + ite.next().text());
//System.out.println("Value 3: " + ite.next().text());
//System.out.println("Value 4: " + ite.next().text());
//
//
// */