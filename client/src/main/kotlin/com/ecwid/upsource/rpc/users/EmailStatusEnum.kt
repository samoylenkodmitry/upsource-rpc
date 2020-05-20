package com.ecwid.upsource.rpc.users

/**
 * Describes status of an email address
 */
enum class EmailStatusEnum(val value: Byte, val originalName: String) {
	OK(value = 1, originalName = "OK"),
	NOT_VERIFIED(value = 2, originalName = "NotVerified"),
	NOT_SPECIFIED(value = 3, originalName = "NotSpecified"),
	HARD_BOUNCE(value = 4, originalName = "HardBounce");

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}
