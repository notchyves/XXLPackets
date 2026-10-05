package tfar.xlpackets.mixin;

import net.minecraft.network.protocol.common.ClientboundCustomPayloadPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
// tr
@Mixin(ClientboundCustomPayloadPacket.class)
public class ClientboundCustomPayloadPacketMixin {

    @ModifyConstant(method = {"<init>"},
            constant = @Constant(intValue = 8388608))
    private int xlPackets(int old) {
        return 2147483647;
    }
}
