package dev.nguyenduyhai.contentcalendar.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(value = "cc")
public record ContentCalendarProperties(String nguyenduyhai, String welcome_message, String function) {
}
