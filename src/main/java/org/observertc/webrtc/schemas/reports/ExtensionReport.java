/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.observertc.webrtc.schemas.reports;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

/** Extended Report payload. Contains customer added report information */
@org.apache.avro.specific.AvroGenerated
public class ExtensionReport extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1718295876299572799L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ExtensionReport\",\"namespace\":\"org.observertc.webrtc.schemas.reports\",\"doc\":\"Extended Report payload. Contains customer added report information\",\"fields\":[{\"name\":\"mediaUnitId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"callName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"userId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"browserId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"peerConnectionUUID\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"extensionType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"payload\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ExtensionReport> ENCODER =
      new BinaryMessageEncoder<ExtensionReport>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ExtensionReport> DECODER =
      new BinaryMessageDecoder<ExtensionReport>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ExtensionReport> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ExtensionReport> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ExtensionReport> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ExtensionReport>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ExtensionReport to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ExtensionReport from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ExtensionReport instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ExtensionReport fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.String mediaUnitId;
   private java.lang.String callName;
   private java.lang.String userId;
   private java.lang.String browserId;
   private java.lang.String peerConnectionUUID;
   private java.lang.String extensionType;
   private java.lang.String payload;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ExtensionReport() {}

  /**
   * All-args constructor.
   * @param mediaUnitId The new value for mediaUnitId
   * @param callName The new value for callName
   * @param userId The new value for userId
   * @param browserId The new value for browserId
   * @param peerConnectionUUID The new value for peerConnectionUUID
   * @param extensionType The new value for extensionType
   * @param payload The new value for payload
   */
  public ExtensionReport(java.lang.String mediaUnitId, java.lang.String callName, java.lang.String userId, java.lang.String browserId, java.lang.String peerConnectionUUID, java.lang.String extensionType, java.lang.String payload) {
    this.mediaUnitId = mediaUnitId;
    this.callName = callName;
    this.userId = userId;
    this.browserId = browserId;
    this.peerConnectionUUID = peerConnectionUUID;
    this.extensionType = extensionType;
    this.payload = payload;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return mediaUnitId;
    case 1: return callName;
    case 2: return userId;
    case 3: return browserId;
    case 4: return peerConnectionUUID;
    case 5: return extensionType;
    case 6: return payload;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: mediaUnitId = value$ != null ? value$.toString() : null; break;
    case 1: callName = value$ != null ? value$.toString() : null; break;
    case 2: userId = value$ != null ? value$.toString() : null; break;
    case 3: browserId = value$ != null ? value$.toString() : null; break;
    case 4: peerConnectionUUID = value$ != null ? value$.toString() : null; break;
    case 5: extensionType = value$ != null ? value$.toString() : null; break;
    case 6: payload = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'mediaUnitId' field.
   * @return The value of the 'mediaUnitId' field.
   */
  public java.lang.String getMediaUnitId() {
    return mediaUnitId;
  }



  /**
   * Gets the value of the 'callName' field.
   * @return The value of the 'callName' field.
   */
  public java.lang.String getCallName() {
    return callName;
  }



  /**
   * Gets the value of the 'userId' field.
   * @return The value of the 'userId' field.
   */
  public java.lang.String getUserId() {
    return userId;
  }



  /**
   * Gets the value of the 'browserId' field.
   * @return The value of the 'browserId' field.
   */
  public java.lang.String getBrowserId() {
    return browserId;
  }



  /**
   * Gets the value of the 'peerConnectionUUID' field.
   * @return The value of the 'peerConnectionUUID' field.
   */
  public java.lang.String getPeerConnectionUUID() {
    return peerConnectionUUID;
  }



  /**
   * Gets the value of the 'extensionType' field.
   * @return The value of the 'extensionType' field.
   */
  public java.lang.String getExtensionType() {
    return extensionType;
  }



  /**
   * Gets the value of the 'payload' field.
   * @return The value of the 'payload' field.
   */
  public java.lang.String getPayload() {
    return payload;
  }



  /**
   * Creates a new ExtensionReport RecordBuilder.
   * @return A new ExtensionReport RecordBuilder
   */
  public static org.observertc.webrtc.schemas.reports.ExtensionReport.Builder newBuilder() {
    return new org.observertc.webrtc.schemas.reports.ExtensionReport.Builder();
  }

  /**
   * Creates a new ExtensionReport RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ExtensionReport RecordBuilder
   */
  public static org.observertc.webrtc.schemas.reports.ExtensionReport.Builder newBuilder(org.observertc.webrtc.schemas.reports.ExtensionReport.Builder other) {
    if (other == null) {
      return new org.observertc.webrtc.schemas.reports.ExtensionReport.Builder();
    } else {
      return new org.observertc.webrtc.schemas.reports.ExtensionReport.Builder(other);
    }
  }

  /**
   * Creates a new ExtensionReport RecordBuilder by copying an existing ExtensionReport instance.
   * @param other The existing instance to copy.
   * @return A new ExtensionReport RecordBuilder
   */
  public static org.observertc.webrtc.schemas.reports.ExtensionReport.Builder newBuilder(org.observertc.webrtc.schemas.reports.ExtensionReport other) {
    if (other == null) {
      return new org.observertc.webrtc.schemas.reports.ExtensionReport.Builder();
    } else {
      return new org.observertc.webrtc.schemas.reports.ExtensionReport.Builder(other);
    }
  }

  /**
   * RecordBuilder for ExtensionReport instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ExtensionReport>
    implements org.apache.avro.data.RecordBuilder<ExtensionReport> {

    private java.lang.String mediaUnitId;
    private java.lang.String callName;
    private java.lang.String userId;
    private java.lang.String browserId;
    private java.lang.String peerConnectionUUID;
    private java.lang.String extensionType;
    private java.lang.String payload;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.observertc.webrtc.schemas.reports.ExtensionReport.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.mediaUnitId)) {
        this.mediaUnitId = data().deepCopy(fields()[0].schema(), other.mediaUnitId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.callName)) {
        this.callName = data().deepCopy(fields()[1].schema(), other.callName);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.userId)) {
        this.userId = data().deepCopy(fields()[2].schema(), other.userId);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.browserId)) {
        this.browserId = data().deepCopy(fields()[3].schema(), other.browserId);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.peerConnectionUUID)) {
        this.peerConnectionUUID = data().deepCopy(fields()[4].schema(), other.peerConnectionUUID);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.extensionType)) {
        this.extensionType = data().deepCopy(fields()[5].schema(), other.extensionType);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.payload)) {
        this.payload = data().deepCopy(fields()[6].schema(), other.payload);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
    }

    /**
     * Creates a Builder by copying an existing ExtensionReport instance
     * @param other The existing instance to copy.
     */
    private Builder(org.observertc.webrtc.schemas.reports.ExtensionReport other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.mediaUnitId)) {
        this.mediaUnitId = data().deepCopy(fields()[0].schema(), other.mediaUnitId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.callName)) {
        this.callName = data().deepCopy(fields()[1].schema(), other.callName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.userId)) {
        this.userId = data().deepCopy(fields()[2].schema(), other.userId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.browserId)) {
        this.browserId = data().deepCopy(fields()[3].schema(), other.browserId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.peerConnectionUUID)) {
        this.peerConnectionUUID = data().deepCopy(fields()[4].schema(), other.peerConnectionUUID);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.extensionType)) {
        this.extensionType = data().deepCopy(fields()[5].schema(), other.extensionType);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.payload)) {
        this.payload = data().deepCopy(fields()[6].schema(), other.payload);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'mediaUnitId' field.
      * @return The value.
      */
    public java.lang.String getMediaUnitId() {
      return mediaUnitId;
    }


    /**
      * Sets the value of the 'mediaUnitId' field.
      * @param value The value of 'mediaUnitId'.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.ExtensionReport.Builder setMediaUnitId(java.lang.String value) {
      validate(fields()[0], value);
      this.mediaUnitId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'mediaUnitId' field has been set.
      * @return True if the 'mediaUnitId' field has been set, false otherwise.
      */
    public boolean hasMediaUnitId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'mediaUnitId' field.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.ExtensionReport.Builder clearMediaUnitId() {
      mediaUnitId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'callName' field.
      * @return The value.
      */
    public java.lang.String getCallName() {
      return callName;
    }


    /**
      * Sets the value of the 'callName' field.
      * @param value The value of 'callName'.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.ExtensionReport.Builder setCallName(java.lang.String value) {
      validate(fields()[1], value);
      this.callName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'callName' field has been set.
      * @return True if the 'callName' field has been set, false otherwise.
      */
    public boolean hasCallName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'callName' field.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.ExtensionReport.Builder clearCallName() {
      callName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'userId' field.
      * @return The value.
      */
    public java.lang.String getUserId() {
      return userId;
    }


    /**
      * Sets the value of the 'userId' field.
      * @param value The value of 'userId'.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.ExtensionReport.Builder setUserId(java.lang.String value) {
      validate(fields()[2], value);
      this.userId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'userId' field has been set.
      * @return True if the 'userId' field has been set, false otherwise.
      */
    public boolean hasUserId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'userId' field.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.ExtensionReport.Builder clearUserId() {
      userId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'browserId' field.
      * @return The value.
      */
    public java.lang.String getBrowserId() {
      return browserId;
    }


    /**
      * Sets the value of the 'browserId' field.
      * @param value The value of 'browserId'.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.ExtensionReport.Builder setBrowserId(java.lang.String value) {
      validate(fields()[3], value);
      this.browserId = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'browserId' field has been set.
      * @return True if the 'browserId' field has been set, false otherwise.
      */
    public boolean hasBrowserId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'browserId' field.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.ExtensionReport.Builder clearBrowserId() {
      browserId = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'peerConnectionUUID' field.
      * @return The value.
      */
    public java.lang.String getPeerConnectionUUID() {
      return peerConnectionUUID;
    }


    /**
      * Sets the value of the 'peerConnectionUUID' field.
      * @param value The value of 'peerConnectionUUID'.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.ExtensionReport.Builder setPeerConnectionUUID(java.lang.String value) {
      validate(fields()[4], value);
      this.peerConnectionUUID = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'peerConnectionUUID' field has been set.
      * @return True if the 'peerConnectionUUID' field has been set, false otherwise.
      */
    public boolean hasPeerConnectionUUID() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'peerConnectionUUID' field.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.ExtensionReport.Builder clearPeerConnectionUUID() {
      peerConnectionUUID = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'extensionType' field.
      * @return The value.
      */
    public java.lang.String getExtensionType() {
      return extensionType;
    }


    /**
      * Sets the value of the 'extensionType' field.
      * @param value The value of 'extensionType'.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.ExtensionReport.Builder setExtensionType(java.lang.String value) {
      validate(fields()[5], value);
      this.extensionType = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'extensionType' field has been set.
      * @return True if the 'extensionType' field has been set, false otherwise.
      */
    public boolean hasExtensionType() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'extensionType' field.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.ExtensionReport.Builder clearExtensionType() {
      extensionType = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'payload' field.
      * @return The value.
      */
    public java.lang.String getPayload() {
      return payload;
    }


    /**
      * Sets the value of the 'payload' field.
      * @param value The value of 'payload'.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.ExtensionReport.Builder setPayload(java.lang.String value) {
      validate(fields()[6], value);
      this.payload = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'payload' field has been set.
      * @return True if the 'payload' field has been set, false otherwise.
      */
    public boolean hasPayload() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'payload' field.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.ExtensionReport.Builder clearPayload() {
      payload = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ExtensionReport build() {
      try {
        ExtensionReport record = new ExtensionReport();
        record.mediaUnitId = fieldSetFlags()[0] ? this.mediaUnitId : (java.lang.String) defaultValue(fields()[0]);
        record.callName = fieldSetFlags()[1] ? this.callName : (java.lang.String) defaultValue(fields()[1]);
        record.userId = fieldSetFlags()[2] ? this.userId : (java.lang.String) defaultValue(fields()[2]);
        record.browserId = fieldSetFlags()[3] ? this.browserId : (java.lang.String) defaultValue(fields()[3]);
        record.peerConnectionUUID = fieldSetFlags()[4] ? this.peerConnectionUUID : (java.lang.String) defaultValue(fields()[4]);
        record.extensionType = fieldSetFlags()[5] ? this.extensionType : (java.lang.String) defaultValue(fields()[5]);
        record.payload = fieldSetFlags()[6] ? this.payload : (java.lang.String) defaultValue(fields()[6]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ExtensionReport>
    WRITER$ = (org.apache.avro.io.DatumWriter<ExtensionReport>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ExtensionReport>
    READER$ = (org.apache.avro.io.DatumReader<ExtensionReport>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.mediaUnitId == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.mediaUnitId);
    }

    if (this.callName == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.callName);
    }

    if (this.userId == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.userId);
    }

    if (this.browserId == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.browserId);
    }

    out.writeString(this.peerConnectionUUID);

    if (this.extensionType == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.extensionType);
    }

    out.writeString(this.payload);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.mediaUnitId = null;
      } else {
        this.mediaUnitId = in.readString();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.callName = null;
      } else {
        this.callName = in.readString();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.userId = null;
      } else {
        this.userId = in.readString();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.browserId = null;
      } else {
        this.browserId = in.readString();
      }

      this.peerConnectionUUID = in.readString();

      if (in.readIndex() != 1) {
        in.readNull();
        this.extensionType = null;
      } else {
        this.extensionType = in.readString();
      }

      this.payload = in.readString();

    } else {
      for (int i = 0; i < 7; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.mediaUnitId = null;
          } else {
            this.mediaUnitId = in.readString();
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.callName = null;
          } else {
            this.callName = in.readString();
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.userId = null;
          } else {
            this.userId = in.readString();
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.browserId = null;
          } else {
            this.browserId = in.readString();
          }
          break;

        case 4:
          this.peerConnectionUUID = in.readString();
          break;

        case 5:
          if (in.readIndex() != 1) {
            in.readNull();
            this.extensionType = null;
          } else {
            this.extensionType = in.readString();
          }
          break;

        case 6:
          this.payload = in.readString();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









