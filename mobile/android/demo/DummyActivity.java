package org.iota.mobile;

import android.os.*;
import android.app.*;
import android.util.Log;


public class DummyActivity extends Activity{
    public final String TX_TRYTES = "XYIUIABLAEBBFCTMDCGPVNCQELHIEBVNRPWBSCABWRAVGVOVMFEHWJCUILYIXOPJNASEOHXPJBXFNHHSWEKEGEEFSAZDENWMOAXGJCQZQDGSTTMNQPYJBLRVY9T9HSQNXWYCSMLEXVWCASQ9MHPMBZ9PSSZEKCXYLDYKTOVAWQXOTGMWHUIACLUTAIKUIXZND9YMQKZBTIWOUIVQWTSBNVDCUWYP9HDMQPTXWEQYXVEOFXVGQSBHGHMKVFZZQIALVLMINZGNLEAOCQZFHPTQTQXGZQJLTBFPLWTESFYOJNJGJRYWHPEBSPSXEWCITXBJBMXDFCUDUKKGZMDOOPIBJLC9GPIBTLVQWPGTADEXNI9SWJNJXKXIJCPMICHBIFRXVWNJDP9BDELH9NOMJKGEBOCLWEXPEBFBWQLHFWQVCFIPVUXNREWXTCTFQHZYTMSUXQZTJQOWZZZCFIJ9NFXVSDFEXLODNJFREDOQ9WLLQAKRYKUCGUYEFICOLCKZHWFCLFGLKORFQFZXZXTEXWGRJPZ99KAJYFDWZNMBKQXOLRCAPDZWTZIMSUDSNDTKJLKJWFCTHZFYFW9EF9T9OGNFBNCRDDTRQUBIBSIWJNRAFXG9UDRGSXDQ9OKAREHQOCXSULYOA9IWJOYGWYOZGVQUDNBZXHZBCCBQ9PPKIKSWLNLPRSRRYLGCQIJKYNTAJBGPAOYWIUOIR9WOQYLSQYPWKUWBD9AUVZZT9KWUNQZYLOKTWRVJDVJSDBO9XYEGJIZWRMU9SRUVGMZUX9BXACUDYNXXRTYN9UVLJUIJGNAHVWSWRFHKIXTYINVHFHGXJVVJFLFTJR9LPZCJPHQOZQRXFJPYIHCVBXCIXZFPCC9RYLOYMBXDTRDEDWPZMZYIKGTXAQYJVEFDSF9QWROXAJS9ZPAWHLKIEKUPFKXOGLUYXCQNVVBYEJG9STYYRHKAOOID9UDPCMSBOVKWXCTSRSBKOZIIUDAABKXIBIDNTXZWLITYANTGVRYBEOZAOEWGPGLKGICMPADAEHHOCUSKXBKO9REVSI9FDFDCPMUGCLJVNHMHWHAIURTWDTSHMOPVVMGWLECCPXHAAQRCDCUWDVMBRLMQYTY9PLIFIUNXZUNY9UIVHBZKMNYOPRSIKBKWDDOYJQWCSPFBLODZVAPGWHJJKOBYETEUUPJDIFLWUCMYWEUSZLWANGHYSNUXJAPFZJADQWAZCOYXWJAQCYWFBRNXJRHMIUFEROW9Z9QJAPFDIRUUTD9RPZYFD9PRPU9YVGIQMHNEYVDLEIESZEO9QLOLNHSVNGNZFHODQXXX9K9NAUDG9UENCXFTS9FQXVXJYIVBL9OPHXTPCWKEDMXXJQLXHBNTNVWHGFNNXAEKGHSBGCQFFIIRKMSYRXBCDTUCJESVXJGZTHUJWGWDD9MDXBCXEPBMDZEVUGIXHVCGDFVOYY9QEJJYQALKJWFKMYSKZRXQNGI9MC9FLSIYER9BZGDXGZUAMBZFJLWNBKMWWOSUE9XGOUPDDSCJWN9PJD9LKUVVYHCRBBBABVKZJOXFGCRXXDEGLGYDXLFFPWFNCGCRPKGSEXQNONXKJWDGTFZWWOSK9TKUTHGHBNLQADQ9QS9XLNRVUMSRFVYVSEQEGGTOWHUMZUEVQEROFMYLXYXU9GUJSQFSMMVHQS9SVIH9X9RNORYZOLIIA9RWAUFWDKQXRAHPALEW9LDXZFSRDCPYVSSXGOEPSVZCVWXDXVJKDWUBGQEUGNAUD9GNEQEVXXLTNVBIWJLLBCTFZWODFLIIDSNUPDJRHNPH9NBOKOVXCGEEZA9ZWKRNBL9XOOPF9OCP9VORMMVSIASCEAUVVJHBLWLHDHWVJDDTEBFIKHOEVIIDJXA9MTLUSZVPJPHLRASOAGNNPQYIAZVKTROQXISIALDESIHLNREAAPXCFU9AZTORQGYCFWVFHFQMAJPUSYVAEERWGQSKYFZJPWMOAEWXTUEGIDOSSCLBFLMBIZHYIQWSCNPZUTTSKCZXDSELK9KSBHTDSUID9LMBMYXQFAWBBRHFKMMBPTFKDNLQSZAMHMYASZXXKHXKPH9TOHVZUOXDCFHBDNAQEVOQQUGKEW9YQBZWMSVTJGNVUN9TUVYJ9XECFMVIIFTNSNBCUA9TOHPHAYDSAWJTJANNPZELFSWMVLBRUKJDT9B9VWCXBMUDNLVDEEWQRITLOTFLVOUDQGEEXK9CO9DCMNDY9VZUGMLVFKLUBNSQOABRDMIWVYGMENSBHUOMGIJ9MNKLST999999999999999999999999999999999999999999999999UMJOPYD99A99999999C99999999WUIHHDPDFBHIQLKEFLUOKIOVFOCPFPWBKUCCGA9YUUEPTLUXRLZHVKEOLJQWHBOLSCWKVXCOBSVJHY9YXDMTFSSWIPNAYXJPQNQCZAIT9ADYOLDXZVBTEUWMVYOOODSCPKAWWHOFQTLZKRPURYBMCU9YHSIYQZ9999W9VELHQPPERYSG9ZLLAHQKDLJQBKYYZOSRQOESEELED9CZHBLAMALTJJZAFWNMWGAAUFJMNQDGKVA9999999999999999999999999999999HDU9RGVJE999999999MMMMMMMMMDC99999999OKGA9999999999999";
    public final String TX2_TRYTES = "999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999A9RGRKVGWMWMKOLVMDFWJUHNUNYWZTJADGGPZGXNLERLXYWJE9WQHWWBMCPZMVVMJUMWWBLZLNMLDCGDJ999999999999999999999999999999999999999999999999999999YGYQIVD99999999999999999999TXEFLKNPJRBYZPORHZU9CEMFIFVVQBUSTDGSJCZMBTZCDTTJVUFPTCCVHHORPMGCURKTH9VGJIXUQJVHK999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999";
  public void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);

    setContentView(android.R.layout.simple_list_item_1);

    Log.e("IOTA", "Starting PoW");
    String nonce = Interface.doPOW(TX2_TRYTES, 14);
    Log.e("IOTA", "Retrieved nonce: " + nonce);
  }
}
