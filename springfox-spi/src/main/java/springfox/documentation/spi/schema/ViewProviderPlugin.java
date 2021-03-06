/*
 *
 *  Copyright 2017 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *
 */

package springfox.documentation.spi.schema;

import com.fasterxml.classmate.ResolvedType;
import org.springframework.plugin.core.Plugin;
import springfox.documentation.service.ResolvedMethodParameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.OperationContext;
import springfox.documentation.spi.service.contexts.RequestMappingContext;

import java.util.Optional;

public interface ViewProviderPlugin extends Plugin<DocumentationType> {

  /**
   * Finds a active view for the parameter type
   * @param type - resolved type to provide view for
   * @param parameter - resolved method parameter to take additional information from, if needed 
   * @return resolved view name, if found
   */
  Optional<ResolvedType> viewFor(ResolvedType type, ResolvedMethodParameter parameter);

  /**
   * Finds a active view for the  return type
   * @param type - resolved type to provide view for
   * @param context - method context to take additional information from, if needed 
   * @return resolved view name, if found
   */
  Optional<ResolvedType> viewFor(ResolvedType type, RequestMappingContext context);
  
  /**
   * Finds a active view for the  return type
   * @param type - resolved type to provide view for
   * @param context - operation context to take additional information from, if needed 
   * @return resolved view name, if found
   */
  Optional<ResolvedType> viewFor(ResolvedType type, OperationContext context);
}
