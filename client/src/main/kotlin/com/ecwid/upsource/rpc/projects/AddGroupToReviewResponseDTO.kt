// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

data class AddGroupToReviewResponseDTO(
	/**
	 * How many users from the specified group were added (required)
	 */
	val addedUsersCount: Int
) {
	internal constructor() : this(
		addedUsersCount = 0
	)
}
