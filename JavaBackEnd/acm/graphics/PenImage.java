// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   GPen.java

package acm.graphics;

import acm.util.MediaTools;
import java.awt.Image;

class PenImage {

	PenImage() {
	}

	public static Image getImage() {
		return MediaTools.createImage(HEX_DATA);
	}

	private static final String HEX_DATA[] = { "4749463839614F006500F70000FFFFFF9800983399999898",
			"00111111222222000054CBFFCB0032980033660033CC0033",
			"FE00323266330066660000659800989800CC9900FE993298",
			"00659800CC0099FE0098659898999999CC9900FE98009800",
			"329800659900CC9800FE3399CB3399FF9999339898659832",
			"0098650099339998659833CB9833FF9999CC0099FE003366",
			"99656698CC9898FF99993232003366003200323300663200",
			"9833339965009866339900663300983200666600986500CC",
			"3300FE3200CC6600FE65CCCC98CCFF99FFCC99FFFF993300",
			"CC3200FE6600CC6500FECC0033CC0066FE0032FE00653399",
			"33339966669933669865CC00CCCB00FEFE00CBFE00FE6699",
			"CC6598FF9898CC9999FFCB9833CC9966FF9933FF98653333",
			"33326532323265326565660033653232660066653265CC33",
			"00CC6600FE3200FE65000066CC0099CC0066FE0098FE00CC",
			"CC00FECB00CCFE00FEFE33CC0033FE0066CC0066FE00CB33",
			"98CC6699FF3399FF659866CC9965FF9898CC9899FF99CCCC",
			"00CCFE00FECB00FEFE009933339966339933669865659833",
			"CB9966CC9933FF9865FF33CBCB33FFCC33CCFF33FFFF99CB",
			"3399FF3399CC6698FF65CC98CCCCCCCCCC99FFCBCBFFFF99",
			"CCFFCBCBFF99FFFFCBFF3333CB3366CB3333FF3366FF6533",
			"CB6666CC6633FF6565FFCB3333CB6533CB3365CC6666FF33",
			"33FF6633FF3366FF656533CB3333FF3333CB6633FF6666CB",
			"3366FF3366CC6665FF65CB33CBCC66CCCC33FFCC65FFFF33",
			"CCFF65CCFF33FFFF65FF66CCCC65FFCC65CCFF65FFFF98CC",
			"CC99FFCC99CCFF99FFFFCBCB33CCFF33CCCC66CCFF65FFCC",
			"33FFFF33FFCC65FFFF65444444656532DDDDDDCBFFFFFFFF",
			"CBEEEEEE1000009800000010006600000000980000667777",
			"77888888AAAAAABBBBBB5555556666660000100000224400",
			"005400000000CC0000DC0000EE0000FE0000320000440088",
			"0000980000AA0000BA0000CC0000DC0000EE0000FE00CC00",
			"00DC0000EE0000FE00000044000054000066000076002200",
			"00320000AA0000BA00000022000032007600008800000000",
			"AA0000BA00007600008800000021F90401000000002C0000",
			"00004F006500C7FFFFFF9800983399999898001111112222",
			"22000054CBFFCB0032980033660033CC0033FE0032326633",
			"0066660000659800989800CC9900FE99329800659800CC00",
			"99FE0098659898999999CC9900FE98009800329800659900",
			"CC9800FE3399CB3399FF9999339898659832009865009933",
			"9998659833CB9833FF9999CC0099FE00336699656698CC98",
			"98FF99993232003366003200323300663200983333996500",
			"9866339900663300983200666600986500CC3300FE3200CC",
			"6600FE65CCCC98CCFF99FFCC99FFFF993300CC3200FE6600",
			"CC6500FECC0033CC0066FE0032FE00653399333399666699",
			"33669865CC00CCCB00FEFE00CBFE00FE6699CC6598FF9898",
			"CC9999FFCB9833CC9966FF9933FF98653333333265323232",
			"65326565660033653232660066653265CC3300CC6600FE32",
			"00FE65000066CC0099CC0066FE0098FE00CCCC00FECB00CC",
			"FE00FEFE33CC0033FE0066CC0066FE00CB3398CC6699FF33",
			"99FF659866CC9965FF9898CC9899FF99CCCC00CCFE00FECB",
			"00FEFE009933339966339933669865659833CB9966CC9933",
			"FF9865FF33CBCB33FFCC33CCFF33FFFF99CB3399FF3399CC",
			"6698FF65CC98CCCCCCCCCC99FFCBCBFFFF99CCFFCBCBFF99",
			"FFFFCBFF3333CB3366CB3333FF3366FF6533CB6666CC6633",
			"FF6565FFCB3333CB6533CB3365CC6666FF3333FF6633FF33",
			"66FF656533CB3333FF3333CB6633FF6666CB3366FF3366CC",
			"6665FF65CB33CBCC66CCCC33FFCC65FFFF33CCFF65CCFF33",
			"FFFF65FF66CCCC65FFCC65CCFF65FFFF98CCCC99FFCC99CC",
			"FF99FFFFCBCB33CCFF33CCCC66CCFF65FFCC33FFFF33FFCC",
			"65FFFF65444444656532DDDDDDCBFFFFFFFFCBEEEEEE1000",
			"00980000001000660000000098000066777777888888AAAA",
			"AABBBBBB5555556666660000100000224400005400000000",
			"CC0000DC0000EE0000FE00003200004400880000980000AA",
			"0000BA0000CC0000DC0000EE0000FE00CC0000DC0000EE00",
			"00FE0000004400005400006600007600220000320000AA00",
			"00BA00000022000032007600008800000000AA0000BA0000",
			"7600008800000008FF0001081C48B0A0C18308132A5CA810",
			"12248610234A640809DBBF2DD830E431D1451B8689204326",
			"84C4022306483F5AB0E882ADE5968F226386C40026E38F47",
			"9030E8C45072CB0F9940252EEB226265476D0CFE29C5F630",
			"A8538818B6B4C00869D9D3AB22B7FC636115ABD7AF60C38A",
			"1D4BB6ACD9B368D3AA5DCB166B450334E23280D916E48F2D",
			"1E7F406AA11792096D2CEA4A848491C58FBE3FF23CFA81C1",
			"0B5DC10A317089CAC221DF9C5E5E428EF8A30B06315D0C30",
			"D0267573C8652CA23E36CDBAB5EBD7B063CB9E4DBBB6EDC1",
			"D80C6CD9D2F4B6418E09BAD0B04143B3EF81183A62435CA5",
			"4B8CC0C73B6364BCF3824E9FBE519BD49B27A76516CB6F57",
			"FFC4963AE70A315EC0E0DD52597C4B9D7A5B3844597235ED",
			"962CE2D2E8D245065E6C941C0700249E61D3C50CA46504C9",
			"01020A74D7671D79D15B830E7A661C850661808D18D860E8",
			"E187208628E288249668E28928A6A8E28A6C2D13156F2326",
			"275C0C4C819887180CE8C7D28402A2C6400C5BD8E0455C5D",
			"74D5E00F167551194A5EF0C7608384BD601824BBC8971C76",
			"024615C305F275F74877D878F1D37184B177521E3AB16002",
			"0BE859729C760A22F6C32E4876C1236D5191E7D04D7BE6D4",
			"451E6416261F75D571E8E66DA8BDA7174F8CB2B09591B60D",
			"95D1231718888D132C8077E16D26607381097ACD199F81F6",
			"D1462084CFB17041A65B7431269960685728DC51EBDD699B",
			"8618C4B5C58F5B00D95E83B8CEFADF931882975C71A086F8",
			"1E035B98606B83828057638C196D11E088E3C148A2815892",
			"F8CFB42C862BEEB8E4966BEEB9E8A6ABEEBAECB6EBEEBBF0",
			"C62BEFBCF4CA1B100021FF0B4D414347436F6E2004031039",
			"000000015772697474656E20627920474946436F6E766572",
			"74657220322E342E33206F66204D6F6E6461792C204D6179", "2032352C2031393938003B" };

}
