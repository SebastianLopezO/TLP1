#Monitoreo WireShark

## Salida Consola
´´´bash
---------------------------------------
         Menu Principal
---------------------------------------
|      1. Ingresar                    |
|      2. Listar                      |
|      3. Salir                       |
---------------------------------------
Seleccione Opcion: 2
nov. 21, 2023 6:58:59 A. M. org.wildfly.naming.client.Version <clinit>
INFO: WildFly Naming version 2.0.0.Final
nov. 21, 2023 6:58:59 A. M. org.wildfly.security.Version <clinit>
INFO: ELY00001: WildFly Elytron version 2.0.0.Final
nov. 21, 2023 6:58:59 A. M. org.xnio.Xnio <clinit>
INFO: XNIO version 3.8.8.Final
nov. 21, 2023 6:58:59 A. M. org.xnio.nio.NioXnio <clinit>
INFO: XNIO NIO Implementation Version 3.8.8.Final
nov. 21, 2023 6:59:00 A. M. org.jboss.threads.Version <clinit>
INFO: JBoss Threads version 2.4.0.Final
nov. 21, 2023 6:59:00 A. M. org.jboss.remoting3.EndpointImpl <clinit>
INFO: JBoss Remoting version 5.0.26.Final
62835227 - Sebastian Lopez 2005-01-02
63229501 - Sebastian Lopez 2005-01-02
6355467 - Sebastian Lopez 2005-02-01
63818954 - Jose Botero 1987-06-17
64918159 - Juan Perez 2023-11-21
6503280 - prueba dos 2005-02-01
---------------------------------------
         Menu Principal
---------------------------------------
|      1. Ingresar                    |
|      2. Listar                      |
|      3. Salir                       |
---------------------------------------
Seleccione Opcion: 1
Inicia captura de valores
    Ingrese los nombre del estudiante: 
Wireshark
    Ingrese los apellidos del estudiante: 
test
    Ingrese la fecha de Nacimiento del estudiante: 
       Digite el año a cuato digitos: 
2023
       Digite el mes a dos digitos: 
11
       Digite el día a dos digitos: 
21
Se ha eliminado el archivo
Se ha creado el archivo
---------------------------------------
         Menu Principal
---------------------------------------
|      1. Ingresar                    |
|      2. Listar                      |
|      3. Salir                       |
---------------------------------------
Seleccione Opcion: 2
62835227 - Sebastian Lopez 2005-01-02
63229501 - Sebastian Lopez 2005-01-02
6355467 - Sebastian Lopez 2005-02-01
63818954 - Jose Botero 1987-06-17
64918159 - Juan Perez 2023-11-21
6503280 - prueba dos 2005-02-01
65912229 - Wireshark test 2023-11-21
---------------------------------------
         Menu Principal
---------------------------------------
|      1. Ingresar                    |
|      2. Listar                      |
|      3. Salir                       |
---------------------------------------
Seleccione Opcion: 3
Saliendo...
´´´

## Monitoreo

´´´bash


Carga Wildfly
0000   02 00 00 00 45 00 00 6f ba a8 40 00 80 06 00 00   ....E..o..@.....
0010   7f 00 00 01 7f 00 00 01 1f 90 d1 dc da a1 67 b0   ..............g.
0020   71 48 d8 ba 50 18 27 f9 95 77 00 00 00 00 00 43   qH..P.'..w.....C
0030   03 43 3a 5c 77 69 6c 64 66 6c 79 5c 73 74 61 6e   .C:\wildfly\stan
0040   64 61 6c 6f 6e 65 5c 74 6d 70 5c 61 75 74 68 5c   dalone\tmp\auth\
0050   6c 6f 63 61 6c 31 32 30 31 30 37 36 39 37 39 37   local12010769797
0060   38 36 32 36 35 31 36 32 39 2e 63 68 61 6c 6c 65   862651629.challe
0070   6e 67 65                                          nge

Frame 19: 219 bytes on wire (1752 bits), 219 bytes captured (1752 bits) on interface \Device\NPF_Loopback, id 0
Null/Loopback
    Family: IP (2)
Internet Protocol Version 4, Src: 127.0.0.1, Dst: 127.0.0.1
Transmission Control Protocol, Src Port: 8080, Dst Port: 53724, Seq: 1, Ack: 136, Len: 175
Hypertext Transfer Protocol
    HTTP/1.1 101 Switching Protocols\r\n
    Connection: Upgrade\r\n
    Upgrade: jboss-remoting\r\n
    Sec-JbossRemoting-Accept: 5UzRmIFpKrMs01Mrkf3KPEESPVI=\r\n
    Date: Tue, 21 Nov 2023 11:59:00 GMT\r\n
    \r\n
    [HTTP response 1/1]
    [Time since request: 0.000875000 seconds]
    [Request in frame: 17]
    [Request URI: http://127.0.0.1:8080/]

Carga de proyecto EJB

0000   02 00 00 00 45 00 00 59 ba be 40 00 80 06 00 00   ....E..Y..@.....
0010   7f 00 00 01 7f 00 00 01 d1 dc 1f 90 71 48 d9 0c   ............qH..
0020   da a1 68 3b 50 18 27 f7 4a e5 00 00 00 00 00 2d   ..h;P.'.J......-
0030   30 a4 46 0c a0 13 a0 03 01 8d 2b 00 00 00 00 00   0.F.......+.....
0040   1c 73 65 62 61 73 74 69 61 6e 6c 6f 70 65 7a 6f   .sebastianlopezo
0050   73 6f 72 6e 6f 71 75 69 7a 33 45 4a 42            sornoquiz3EJB



Carga Class StudentRemote

0000   02 00 00 00 45 00 02 ae ba ce 40 00 80 06 00 00   ....E.....@.....
0010   7f 00 00 01 7f 00 00 01 1f 90 d1 dc da a1 68 62   ..............hb
0020   71 48 d9 97 50 18 27 f8 54 b0 00 00 00 00 02 82   qH..P.'.T.......
0030   30 24 46 0c a0 2d f2 03 01 a7 c6 00 01 04 04 08   0$F..-..........
0040   00 00 00 01 00 00 00 13 4c 6f 67 69 63 2e 53 74   ........Logic.St
0050   75 64 65 6e 74 52 65 6d 6f 74 65 04 0a 00 00 00   udentRemote.....
0060   33 6f 72 67 2e 6a 62 6f 73 73 2e 65 6a 62 2e 63   3org.jboss.ejb.c
0070   6c 69 65 6e 74 2e 53 65 72 69 61 6c 69 7a 65 64   lient.Serialized
0080   45 4a 42 49 6e 76 6f 63 61 74 69 6f 6e 48 61 6e   EJBInvocationHan
0090   64 6c 65 72 df 1b 78 98 5f 16 bb e4 04 09 3e 28   dler..x._.....>(
00a0   6f 72 67 2e 6a 62 6f 73 73 2e 65 6a 62 2e 63 6c   org.jboss.ejb.cl
00b0   69 65 6e 74 2e 53 74 61 74 65 6c 65 73 73 45 4a   ient.StatelessEJ
00c0   42 4c 6f 63 61 74 6f 72 d5 cf 9c 76 5f f2 db 52   BLocator...v_..R
00d0   00 00 00 00 38 3e 1f 6f 72 67 2e 6a 62 6f 73 73   ....8>.org.jboss
00e0   2e 65 6a 62 2e 63 6c 69 65 6e 74 2e 45 4a 42 4c   .ejb.client.EJBL
00f0   6f 63 61 74 6f 72 9a 9a f5 e4 24 8f ec 1c 00 00   ocator....$.....
0100   00 07 3e 08 61 66 66 69 6e 69 74 79 16 00 3e 07   ..>.affinity..>.
0110   61 70 70 4e 61 6d 65 16 00 3e 08 62 65 61 6e 4e   appName..>.beanN
0120   61 6d 65 16 00 3e 0c 64 69 73 74 69 6e 63 74 4e   ame..>.distinctN
0130   61 6d 65 16 00 3e 0a 69 64 65 6e 74 69 66 69 65   ame..>.identifie
0140   72 16 00 3e 0a 6d 6f 64 75 6c 65 4e 61 6d 65 16   r..>.moduleName.
0150   00 3e 08 76 69 65 77 54 79 70 65 16 00 16 04 09   .>.viewType.....
0160   3e 21 6f 72 67 2e 6a 62 6f 73 73 2e 65 6a 62 2e   >!org.jboss.ejb.
0170   63 6c 69 65 6e 74 2e 4e 6f 64 65 41 66 66 69 6e   client.NodeAffin
0180   69 74 79 ee c6 ff 7b dd 7e f5 c8 00 00 00 01 3e   ity...{.~......>
0190   08 6e 6f 64 65 4e 61 6d 65 16 00 09 3e 1d 6f 72   .nodeName...>.or
01a0   67 2e 6a 62 6f 73 73 2e 65 6a 62 2e 63 6c 69 65   g.jboss.ejb.clie
01b0   6e 74 2e 41 66 66 69 6e 69 74 79 d6 92 81 ea 9b   nt.Affinity.....
01c0   17 7c f3 00 00 00 00 16 3e 0a 61 6c 63 6f 6d 2d   .|......>.alcom-
01d0   39 32 33 31 3d 3e 07 53 74 75 64 65 6e 74 3d 04   9231=>.Student=.
01e0   09 3e 22 6f 72 67 2e 6a 62 6f 73 73 2e 65 6a 62   .>"org.jboss.ejb
01f0   2e 63 6c 69 65 6e 74 2e 45 4a 42 49 64 65 6e 74   .client.EJBIdent
0200   69 66 69 65 72 62 0e 35 e3 b8 0f cc a8 00 00 00   ifierb.5........
0210   02 39 f3 16 00 3e 10 6d 6f 64 75 6c 65 49 64 65   .9...>.moduleIde
0220   6e 74 69 66 69 65 72 16 00 16 39 fc 04 09 3e 28   ntifier...9...>(
0230   6f 72 67 2e 6a 62 6f 73 73 2e 65 6a 62 2e 63 6c   org.jboss.ejb.cl
0240   69 65 6e 74 2e 45 4a 42 4d 6f 64 75 6c 65 49 64   ient.EJBModuleId
0250   65 6e 74 69 66 69 65 72 5d 96 93 aa 92 65 a1 20   entifier]....e. 
0260   00 00 00 03 39 ef 16 00 39 f1 16 00 39 f3 16 00   ....9...9...9...
0270   16 3d 3d 3e 1c 73 65 62 61 73 74 69 61 6e 6c 6f   .==>.sebastianlo
0280   70 65 7a 6f 73 6f 72 6e 6f 71 75 69 7a 33 45 4a   pezosornoquiz3EJ
0290   42 39 ff 04 15 07 00 00 00 13 4c 6f 67 69 63 2e   B9........Logic.
02a0   53 74 75 64 65 6e 74 52 65 6d 6f 74 65 35 32 01   StudentRemote52.
02b0   00 35                                             .5

Carga de PersonRemote

0000   02 00 00 00 45 00 02 a9 bb 0e 40 00 80 06 00 00   ....E.....@.....
0010   7f 00 00 01 7f 00 00 01 1f 90 d1 dc da a1 6b 0f   ..............k.
0020   71 48 da 2a 50 18 27 f7 a2 fc 00 00 00 00 02 7d   qH.*P.'........}
0030   30 24 46 0c a0 eb ae 03 01 e9 7e 00 01 04 04 08   0$F.......~.....
0040   00 00 00 01 00 00 00 11 42 65 61 6e 2e 50 65 72   ........Bean.Per
0050   73 6f 6e 52 65 6d 6f 74 65 04 0a 00 00 00 33 6f   sonRemote.....3o
0060   72 67 2e 6a 62 6f 73 73 2e 65 6a 62 2e 63 6c 69   rg.jboss.ejb.cli
0070   65 6e 74 2e 53 65 72 69 61 6c 69 7a 65 64 45 4a   ent.SerializedEJ
0080   42 49 6e 76 6f 63 61 74 69 6f 6e 48 61 6e 64 6c   BInvocationHandl
0090   65 72 df 1b 78 98 5f 16 bb e4 04 09 3e 28 6f 72   er..x._.....>(or
00a0   67 2e 6a 62 6f 73 73 2e 65 6a 62 2e 63 6c 69 65   g.jboss.ejb.clie
00b0   6e 74 2e 53 74 61 74 65 6c 65 73 73 45 4a 42 4c   nt.StatelessEJBL
00c0   6f 63 61 74 6f 72 d5 cf 9c 76 5f f2 db 52 00 00   ocator...v_..R..
00d0   00 00 38 3e 1f 6f 72 67 2e 6a 62 6f 73 73 2e 65   ..8>.org.jboss.e
00e0   6a 62 2e 63 6c 69 65 6e 74 2e 45 4a 42 4c 6f 63   jb.client.EJBLoc
00f0   61 74 6f 72 9a 9a f5 e4 24 8f ec 1c 00 00 00 07   ator....$.......
0100   3e 08 61 66 66 69 6e 69 74 79 16 00 3e 07 61 70   >.affinity..>.ap
0110   70 4e 61 6d 65 16 00 3e 08 62 65 61 6e 4e 61 6d   pName..>.beanNam
0120   65 16 00 3e 0c 64 69 73 74 69 6e 63 74 4e 61 6d   e..>.distinctNam
0130   65 16 00 3e 0a 69 64 65 6e 74 69 66 69 65 72 16   e..>.identifier.
0140   00 3e 0a 6d 6f 64 75 6c 65 4e 61 6d 65 16 00 3e   .>.moduleName..>
0150   08 76 69 65 77 54 79 70 65 16 00 16 04 09 3e 21   .viewType.....>!
0160   6f 72 67 2e 6a 62 6f 73 73 2e 65 6a 62 2e 63 6c   org.jboss.ejb.cl
0170   69 65 6e 74 2e 4e 6f 64 65 41 66 66 69 6e 69 74   ient.NodeAffinit
0180   79 ee c6 ff 7b dd 7e f5 c8 00 00 00 01 3e 08 6e   y...{.~......>.n
0190   6f 64 65 4e 61 6d 65 16 00 09 3e 1d 6f 72 67 2e   odeName...>.org.
01a0   6a 62 6f 73 73 2e 65 6a 62 2e 63 6c 69 65 6e 74   jboss.ejb.client
01b0   2e 41 66 66 69 6e 69 74 79 d6 92 81 ea 9b 17 7c   .Affinity......|
01c0   f3 00 00 00 00 16 3e 0a 61 6c 63 6f 6d 2d 39 32   ......>.alcom-92
01d0   33 31 3d 3e 06 50 65 72 73 6f 6e 3d 04 09 3e 22   31=>.Person=..>"
01e0   6f 72 67 2e 6a 62 6f 73 73 2e 65 6a 62 2e 63 6c   org.jboss.ejb.cl
01f0   69 65 6e 74 2e 45 4a 42 49 64 65 6e 74 69 66 69   ient.EJBIdentifi
0200   65 72 62 0e 35 e3 b8 0f cc a8 00 00 00 02 39 f3   erb.5.........9.
0210   16 00 3e 10 6d 6f 64 75 6c 65 49 64 65 6e 74 69   ..>.moduleIdenti
0220   66 69 65 72 16 00 16 39 fc 04 09 3e 28 6f 72 67   fier...9...>(org
0230   2e 6a 62 6f 73 73 2e 65 6a 62 2e 63 6c 69 65 6e   .jboss.ejb.clien
0240   74 2e 45 4a 42 4d 6f 64 75 6c 65 49 64 65 6e 74   t.EJBModuleIdent
0250   69 66 69 65 72 5d 96 93 aa 92 65 a1 20 00 00 00   ifier]....e. ...
0260   03 39 ef 16 00 39 f1 16 00 39 f3 16 00 16 3d 3d   .9...9...9....==
0270   3e 1c 73 65 62 61 73 74 69 61 6e 6c 6f 70 65 7a   >.sebastianlopez
0280   6f 73 6f 72 6e 6f 71 75 69 7a 33 45 4a 42 39 ff   osornoquiz3EJB9.
0290   04 15 07 00 00 00 11 42 65 61 6e 2e 50 65 72 73   .......Bean.Pers
02a0   6f 6e 52 65 6d 6f 74 65 35 32 01 00 35            onRemote52..5



´´´