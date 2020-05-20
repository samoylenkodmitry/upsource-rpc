package com.ecwid.upsource.rpc.misc

data class TestPOP3MailboxResponseDTO(
	/**
	 * Mailbox status. OK (1); LoginFailed (2); ConnectionFailed (3); (required)
	 */
	val status: TestPOP3MailboxStatusEnum,

	/**
	 * Optional text message (optional)
	 */
	val message: String? = null
) {
	internal constructor() : this(
		status = TestPOP3MailboxStatusEnum.OK,
		message = null
	)
}
