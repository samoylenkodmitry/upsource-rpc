// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.events

/**
 * @param name Branch name
 */
@Suppress("unused")
data class NewBranchEventBean(
	/**
	 * Branch name (required)
	 */
	val name: String
) {
	@Suppress("unused")
	internal constructor() : this(
		name = ""
	)
}
