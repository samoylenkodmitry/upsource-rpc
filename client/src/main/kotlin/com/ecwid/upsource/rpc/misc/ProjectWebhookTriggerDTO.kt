// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.misc

/**
 * @param events Events to be notified of
 * @param urls URL targets for webhook requests
 */
@Suppress("unused")
data class ProjectWebhookTriggerDTO(
	/**
	 * Events to be notified of (repeated)
	 */
	val events: List<WebhookEventEnum> = emptyList(),

	/**
	 * URL targets for webhook requests (repeated)
	 */
	val urls: List<String> = emptyList()
)