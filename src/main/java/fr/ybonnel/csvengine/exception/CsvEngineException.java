/*
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Contributors:
 *     ybonnel - initial API and implementation
 */
package fr.ybonnel.csvengine.exception;

/**
 * Exception used by {@link fr.ybonnel.csvengine.CsvEngine}.
 * 
 * @author ybonnel
 * 
 */
@SuppressWarnings("serial")
public class CsvEngineException extends RuntimeException {

	/**
	 * @param message
	 *            message of the exception.
	 */
	public CsvEngineException(String message) {
		super(message);
	}

	/**
	 * @param message
	 *            message of the exception.
	 * @param throwable
	 *            source exception.
	 */
	public CsvEngineException(String message, Throwable throwable) {
		super(message, throwable);
	}

	/**
	 * @param throwable
	 *            source exception.
	 */
	public CsvEngineException(Throwable throwable) {
		super(throwable);
	}

}
