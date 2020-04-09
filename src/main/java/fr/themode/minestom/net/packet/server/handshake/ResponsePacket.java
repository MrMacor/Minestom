package fr.themode.minestom.net.packet.server.handshake;

import fr.themode.minestom.net.packet.PacketWriter;
import fr.themode.minestom.net.packet.server.ServerPacket;

public class ResponsePacket implements ServerPacket {

    public String jsonResponse;

    @Override
    public void write(PacketWriter writer) {
        writer.writeSizedString(jsonResponse);
    }

    @Override
    public int getId() {
        return 0x00;
    }
}
