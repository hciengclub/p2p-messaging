package com.messaging.peerToPeer;

import com.messaging.bootNode.BootNode;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GrpcBootNodeServer extends GrpcServer {
    public GrpcBootNodeServer(int port) {
        super(port);
    }

    @Override
    protected Server getServer() {
        return ServerBuilder.forPort(this.port).addService(new BootNode(this.port)).build();
    }
}
