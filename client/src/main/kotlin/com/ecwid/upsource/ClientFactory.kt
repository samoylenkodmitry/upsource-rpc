// Generated by the codegen. Please DO NOT EDIT!
// source: client-factory.ftl

package com.ecwid.upsource

import com.ecwid.upsource.rpc.UpsourceRPC
import com.ecwid.upsource.serializer.Serializer
import com.ecwid.upsource.transport.RpcTransport

/**
 * Service RPC builders
 */
@Suppress("unused")
object ClientFactory {
	fun newUpsourceRPC(transport: RpcTransport, serializer: Serializer): UpsourceRPC {
		return UpsourceRPC.newBuilder()
			.withTransport(transport)
			.withSerializer(serializer)
			.build()
	}
}
