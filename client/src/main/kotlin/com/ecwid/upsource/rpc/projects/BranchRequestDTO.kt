// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

data class BranchRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Branch name (required)
	 */
	val branch: String
) {
	internal constructor() : this(
		projectId = "",
		branch = ""
	)
}
