/*
 * Copyright 2019-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.aot.test.context.bootstrap.generator.test;

import java.nio.file.Path;

import org.assertj.core.api.AssertProvider;

import org.springframework.aot.context.bootstrap.generator.infrastructure.nativex.NativeConfigurationRegistry;

/**
 * Represent a generated bootstrap structure and act as an entry point for AssertJ
 * assertions.
 *
 * @author Stephane Nicoll
 */
public final class ContextBootstrapStructure implements AssertProvider<ContextBootstrapAssert> {

	private final Path sourceDirectory;

	private final String packageName;

	private final NativeConfigurationRegistry nativeConfigurationRegistry;

	/**
	 * Create an instance based on the specified source {@link Path directory} and chosen
	 * default packageName.
	 * @param sourceDirectory the generated source directory
	 * @param packageName the default package name
	 * @param nativeConfigurationRegistry the native configuration registry
	 */
	public ContextBootstrapStructure(Path sourceDirectory, String packageName,
			NativeConfigurationRegistry nativeConfigurationRegistry) {
		this.sourceDirectory = sourceDirectory;
		this.packageName = packageName;
		this.nativeConfigurationRegistry = nativeConfigurationRegistry;
	}

	@Override
	public ContextBootstrapAssert assertThat() {
		return new ContextBootstrapAssert(this.sourceDirectory, this.packageName, this.nativeConfigurationRegistry);
	}

}
