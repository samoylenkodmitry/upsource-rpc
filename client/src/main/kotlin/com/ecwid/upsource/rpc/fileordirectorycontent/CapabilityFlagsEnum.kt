package com.ecwid.upsource.rpc.fileordirectorycontent

/**
 * Describes "capabilities" of a PSI element
 */
enum class CapabilityFlagsEnum(val value: Byte, val originalName: String) {
	CAN_GOTO_DECLARATION(value = 1, originalName = "canGotoDeclaration"),
	CAN_FIND_USAGES(value = 2, originalName = "canFindUsages"),
	CAN_VIEW_HIERARCHY(value = 4, originalName = "canViewHierarchy"),
	CAN_HAVE_DOCUMENTATION(value = 8, originalName = "canHaveDocumentation"),
	IS_DECLARATION(value = 16, originalName = "isDeclaration"),
	IS_WRITE_ACCESS(value = 32, originalName = "isWriteAccess");

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}
