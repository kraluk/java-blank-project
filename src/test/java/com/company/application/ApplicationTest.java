package com.company.application;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

class ApplicationTest {

    @Test
    void executes_application() {
        // Given
        final var application = new Application();

        // When & Then
        assertThatCode(application::execute)
            .doesNotThrowAnyException();
    }
}
