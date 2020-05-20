package com.ecwid.upsource.rpc.users

data class UserGroupDTO(
	/**
	 * Group ID (required)
	 */
	val id: String,

	/**
	 * Group name (required)
	 */
	val name: String,

	/**
	 * Number of users participating in this group (required)
	 */
	val usersCount: Int
) {
	internal constructor() : this(
		id = "",
		name = "",
		usersCount = 0
	)
}
