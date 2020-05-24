package com.ecwid.upsource.rpc.events

/**
 * Review participant state
 */
enum class ParticipantState(val value: Byte, val originalName: String) {
	UNREAD(value = 0, originalName = "Unread"),
	READ(value = 1, originalName = "Read"),
	ACCEPTED(value = 2, originalName = "Accepted"),
	REJECTED(value = 3, originalName = "Rejected");

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}
