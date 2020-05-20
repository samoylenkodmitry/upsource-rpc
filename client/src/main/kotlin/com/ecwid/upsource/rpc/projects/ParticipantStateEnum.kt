package com.ecwid.upsource.rpc.projects

/**
 * Describes participant status
 */
enum class ParticipantStateEnum(val value: Byte, val originalName: String) {
	UNREAD(value = 1, originalName = "Unread"),
	READ(value = 2, originalName = "Read"),
	ACCEPTED(value = 3, originalName = "Accepted"),
	REJECTED(value = 4, originalName = "Rejected");

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}
