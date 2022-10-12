package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) {
        try {
            DatagramSocket serverSocket = new DatagramSocket(9876);

            while(true){
                byte[] recBuffer = new byte[1024];
                DatagramPacket recPkt = new DatagramPacket(recBuffer, recBuffer.length);
                serverSocket.receive(recPkt);

                byte[] sendBuffer = new byte[1024];
                sendBuffer = "sou o servidor".getBytes();

                DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, recPkt.getAddress(), recPkt.getPort());

                serverSocket.send(sendPacket);
            }
        } catch (Exception e){

        }
    }
}
