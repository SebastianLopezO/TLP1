import javax.naming.InitialContext;
import javax.naming.NamingException;
import Services.SaludoBeanRemote;

public class Main {
	public static void main(String[] args){
		SaludoBeanRemote saludoBean;
		try {
			saludoBean = (SaludoBeanRemote) InitialContext
					.doLookup("/PruebaEJB/SaludoBean!Services.SaludoBeanRemote");
			System.out.println(saludoBean.saludo("TLPI-2020-02"));
			System.out.println("Excelente!");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
			Captura de trafico en WireShark
			
			Frame 277: 82 bytes on wire (656 bits), 82 bytes captured (656 bits) on interface \Device\NPF_Loopback, id 0
		    Section number: 1
		    Interface id: 0 (\Device\NPF_Loopback)
		        Interface name: \Device\NPF_Loopback
		    Encapsulation type: NULL/Loopback (15)
		    Arrival Time: Nov  9, 2023 20:39:18.702819000 Hora est. Pacífico, Sudamérica
		    [Time shift for this packet: 0.000000000 seconds]
		    Epoch Time: 1699580358.702819000 seconds
		    [Time delta from previous captured frame: 0.000389000 seconds]
		    [Time delta from previous displayed frame: 0.000389000 seconds]
		    [Time since reference or first frame: 35.004526000 seconds]
		    Frame Number: 277
		    Frame Length: 82 bytes (656 bits)
		    Capture Length: 82 bytes (656 bits)
		    [Frame is marked: False]
		    [Frame is ignored: False]
		    [Protocols in frame: null:ip:tcp:http:data]
		    [Coloring Rule Name: TCP]
		    [Coloring Rule String: tcp]
		Null/Loopback
		    Family: IP (2)
		Internet Protocol Version 4, Src: 127.0.0.1, Dst: 127.0.0.1
		    0100 .... = Version: 4
		    .... 0101 = Header Length: 20 bytes (5)
		    Differentiated Services Field: 0x00 (DSCP: CS0, ECN: Not-ECT)
		        0000 00.. = Differentiated Services Codepoint: Default (0)
		        .... ..00 = Explicit Congestion Notification: Not ECN-Capable Transport (0)
		    Total Length: 78
		    Identification: 0x5699 (22169)
		    010. .... = Flags: 0x2, Don't fragment
		        0... .... = Reserved bit: Not set
		        .1.. .... = Don't fragment: Set
		        ..0. .... = More fragments: Not set
		    ...0 0000 0000 0000 = Fragment Offset: 0
		    Time to Live: 128
		    Protocol: TCP (6)
		    Header Checksum: 0x0000 [validation disabled]
		    [Header checksum status: Unverified]
		    Source Address: 127.0.0.1
		    Destination Address: 127.0.0.1
		Transmission Control Protocol, Src Port: 8080, Dst Port: 51634, Seq: 1208, Ack: 823, Len: 38
		    Source Port: 8080
		    Destination Port: 51634
		    [Stream index: 57]
		    [Conversation completeness: Complete, WITH_DATA (47)]
		    [TCP Segment Len: 38]
		    Sequence Number: 1208    (relative sequence number)
		    Sequence Number (raw): 2272150394
		    [Next Sequence Number: 1246    (relative sequence number)]
		    Acknowledgment Number: 823    (relative ack number)
		    Acknowledgment number (raw): 3633339268
		    0101 .... = Header Length: 20 bytes (5)
		    Flags: 0x018 (PSH, ACK)
		        000. .... .... = Reserved: Not set
		        ...0 .... .... = Accurate ECN: Not set
		        .... 0... .... = Congestion Window Reduced: Not set
		        .... .0.. .... = ECN-Echo: Not set
		        .... ..0. .... = Urgent: Not set
		        .... ...1 .... = Acknowledgment: Set
		        .... .... 1... = Push: Set
		        .... .... .0.. = Reset: Not set
		        .... .... ..0. = Syn: Not set
		        .... .... ...0 = Fin: Not set
		        [TCP Flags: ·······AP···]
		    Window: 10230
		    [Calculated window size: 2618880]
		    [Window size scaling factor: 256]
		    Checksum: 0x6dc7 [unverified]
		    [Checksum Status: Unverified]
		    Urgent Pointer: 0
		    [Timestamps]
		        [Time since first frame in this TCP stream: 0.469233000 seconds]
		        [Time since previous frame in this TCP stream: 0.002390000 seconds]
		    [SEQ/ACK analysis]
		        [iRTT: 0.000098000 seconds]
		        [Bytes in flight: 38]
		        [Bytes sent since last PSH flag: 38]
		    TCP payload (38 bytes)
		Data (38 bytes)
		    Data: 000000223077598279e6d0030557ee0000043e11486f6c6120544c50492d323032302d30…
		    [Length: 38]
			
			Paquete de bytes:
		 
					 0000   02 00 00 00 45 00 00 4e 56 99 40 00 80 06 00 00   ....E..NV.@.....
			0010   7f 00 00 01 7f 00 00 01 1f 90 c9 b2 87 6e 43 7a   .............nCz
			0020   d8 90 5b 84 50 18 27 f6 6d c7 00 00 00 00 00 22   ..[.P.'.m......"
			0030   30 77 59 82 79 e6 d0 03 05 57 ee 00 00 04 3e 11   0wY.y....W....>.
			0040   48 6f 6c 61 20 54 4c 50 49 2d 32 30 32 30 2d 30   Hola TLPI-2020-0
			0050   32 00                                             2.
			                                         2.

		  */
		

	}
}