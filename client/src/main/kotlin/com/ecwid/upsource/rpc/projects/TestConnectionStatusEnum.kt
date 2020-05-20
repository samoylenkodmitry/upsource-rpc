package com.ecwid.upsource.rpc.projects

/**
 * Describes status of a remote connection
 */
enum class TestConnectionStatusEnum(val value: Byte, val originalName: String) {
	SUCCESS(value = 1, originalName = "Success"),
	FAILURE(value = 2, originalName = "Failure"),
	TIMEOUT(value = 3, originalName = "Timeout");

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}
