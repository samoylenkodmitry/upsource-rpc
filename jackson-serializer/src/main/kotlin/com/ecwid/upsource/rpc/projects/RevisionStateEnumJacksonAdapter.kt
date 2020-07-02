// Generated by the codegen. Please DO NOT EDIT!
// source: jackson-enum.ftl

package com.ecwid.upsource.rpc.projects

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer

class RevisionStateEnumDeserializer : StdDeserializer<RevisionStateEnum>(RevisionStateEnum::class.java) {
	override fun deserialize(p: JsonParser, ctxt: DeserializationContext): RevisionStateEnum? {
		return RevisionStateEnum.fromValue(p.byteValue)
	}
}

class RevisionStateEnumSerializer : StdSerializer<RevisionStateEnum>(RevisionStateEnum::class.java) {
	override fun serialize(value: RevisionStateEnum, gen: JsonGenerator, provider: SerializerProvider) {
		gen.writeNumber(value.value.toShort())
	}
}