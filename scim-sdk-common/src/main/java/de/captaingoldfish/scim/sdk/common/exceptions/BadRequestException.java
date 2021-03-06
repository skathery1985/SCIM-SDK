package de.captaingoldfish.scim.sdk.common.exceptions;

import de.captaingoldfish.scim.sdk.common.constants.HttpStatus;


/**
 * author Pascal Knueppel <br>
 * created at: 04.10.2019 - 00:55 <br>
 * <br>
 */
public class BadRequestException extends ScimException
{

  public BadRequestException(String message)
  {
    this(message, null, null);
  }

  public BadRequestException(String message, String scimType)
  {
    this(message, null, scimType);
  }

  public BadRequestException(String message, Throwable cause, String scimType)
  {
    super(message, cause, HttpStatus.BAD_REQUEST, scimType);
  }

  public BadRequestException(String message, Throwable cause)
  {
    this(message, cause, null);
  }
}
