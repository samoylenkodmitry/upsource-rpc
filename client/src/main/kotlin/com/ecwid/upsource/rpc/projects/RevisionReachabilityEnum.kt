package com.ecwid.upsource.rpc.projects

enum class RevisionReachabilityEnum(val value: Byte, val originalName: String) {
	REACHABLE(value = 1, originalName = "Reachable"),
	UNKNOWN(value = 2, originalName = "Unknown"),
	NOT_REACHABLE(value = 3, originalName = "NotReachable");

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}
