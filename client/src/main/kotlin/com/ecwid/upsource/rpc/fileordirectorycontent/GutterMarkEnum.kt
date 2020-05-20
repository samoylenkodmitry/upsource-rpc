package com.ecwid.upsource.rpc.fileordirectorycontent

/**
 * Describes the properties of a gutter marker
 */
enum class GutterMarkEnum(val value: Byte, val originalName: String) {
	HAS_SUPER_ELEMENTS(value = 1, originalName = "hasSuperElements"),
	HAS_DERIVED_ELEMENTS(value = 2, originalName = "hasDerivedElements");

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}
