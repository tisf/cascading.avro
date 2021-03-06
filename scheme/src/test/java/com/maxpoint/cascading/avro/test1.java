/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.maxpoint.cascading.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class test1 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"test1\",\"namespace\":\"com.maxpoint.cascading.avro\",\"fields\":[{\"name\":\"aBoolean\",\"type\":\"boolean\",\"default\":true},{\"name\":\"anInt\",\"type\":\"int\",\"default\":123},{\"name\":\"aLong\",\"type\":\"long\",\"default\":1},{\"name\":\"aFloat\",\"type\":\"float\",\"default\":0.1},{\"name\":\"aDouble\",\"type\":\"double\",\"default\":110.1},{\"name\":\"aString\",\"type\":[\"string\",\"null\"],\"default\":\"foobar\"},{\"name\":\"aBytes\",\"type\":\"bytes\"},{\"name\":\"aFixed\",\"type\":{\"type\":\"fixed\",\"name\":\"md5\",\"size\":16}},{\"name\":\"aList\",\"type\":{\"type\":\"array\",\"items\":\"int\"}},{\"name\":\"aMap\",\"type\":{\"type\":\"map\",\"values\":\"int\"}},{\"name\":\"aUnion\",\"type\":[\"null\",\"int\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public boolean aBoolean;
  @Deprecated public int anInt;
  @Deprecated public long aLong;
  @Deprecated public float aFloat;
  @Deprecated public double aDouble;
  @Deprecated public java.lang.CharSequence aString;
  @Deprecated public java.nio.ByteBuffer aBytes;
  @Deprecated public com.maxpoint.cascading.avro.md5 aFixed;
  @Deprecated public java.util.List<java.lang.Integer> aList;
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.Integer> aMap;
  @Deprecated public java.lang.Integer aUnion;

  /**
   * Default constructor.
   */
  public test1() {}

  /**
   * All-args constructor.
   */
  public test1(java.lang.Boolean aBoolean, java.lang.Integer anInt, java.lang.Long aLong, java.lang.Float aFloat, java.lang.Double aDouble, java.lang.CharSequence aString, java.nio.ByteBuffer aBytes, com.maxpoint.cascading.avro.md5 aFixed, java.util.List<java.lang.Integer> aList, java.util.Map<java.lang.CharSequence,java.lang.Integer> aMap, java.lang.Integer aUnion) {
    this.aBoolean = aBoolean;
    this.anInt = anInt;
    this.aLong = aLong;
    this.aFloat = aFloat;
    this.aDouble = aDouble;
    this.aString = aString;
    this.aBytes = aBytes;
    this.aFixed = aFixed;
    this.aList = aList;
    this.aMap = aMap;
    this.aUnion = aUnion;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return aBoolean;
    case 1: return anInt;
    case 2: return aLong;
    case 3: return aFloat;
    case 4: return aDouble;
    case 5: return aString;
    case 6: return aBytes;
    case 7: return aFixed;
    case 8: return aList;
    case 9: return aMap;
    case 10: return aUnion;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: aBoolean = (java.lang.Boolean)value$; break;
    case 1: anInt = (java.lang.Integer)value$; break;
    case 2: aLong = (java.lang.Long)value$; break;
    case 3: aFloat = (java.lang.Float)value$; break;
    case 4: aDouble = (java.lang.Double)value$; break;
    case 5: aString = (java.lang.CharSequence)value$; break;
    case 6: aBytes = (java.nio.ByteBuffer)value$; break;
    case 7: aFixed = (com.maxpoint.cascading.avro.md5)value$; break;
    case 8: aList = (java.util.List<java.lang.Integer>)value$; break;
    case 9: aMap = (java.util.Map<java.lang.CharSequence,java.lang.Integer>)value$; break;
    case 10: aUnion = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'aBoolean' field.
   */
  public java.lang.Boolean getABoolean() {
    return aBoolean;
  }

  /**
   * Sets the value of the 'aBoolean' field.
   * @param value the value to set.
   */
  public void setABoolean(java.lang.Boolean value) {
    this.aBoolean = value;
  }

  /**
   * Gets the value of the 'anInt' field.
   */
  public java.lang.Integer getAnInt() {
    return anInt;
  }

  /**
   * Sets the value of the 'anInt' field.
   * @param value the value to set.
   */
  public void setAnInt(java.lang.Integer value) {
    this.anInt = value;
  }

  /**
   * Gets the value of the 'aLong' field.
   */
  public java.lang.Long getALong() {
    return aLong;
  }

  /**
   * Sets the value of the 'aLong' field.
   * @param value the value to set.
   */
  public void setALong(java.lang.Long value) {
    this.aLong = value;
  }

  /**
   * Gets the value of the 'aFloat' field.
   */
  public java.lang.Float getAFloat() {
    return aFloat;
  }

  /**
   * Sets the value of the 'aFloat' field.
   * @param value the value to set.
   */
  public void setAFloat(java.lang.Float value) {
    this.aFloat = value;
  }

  /**
   * Gets the value of the 'aDouble' field.
   */
  public java.lang.Double getADouble() {
    return aDouble;
  }

  /**
   * Sets the value of the 'aDouble' field.
   * @param value the value to set.
   */
  public void setADouble(java.lang.Double value) {
    this.aDouble = value;
  }

  /**
   * Gets the value of the 'aString' field.
   */
  public java.lang.CharSequence getAString() {
    return aString;
  }

  /**
   * Sets the value of the 'aString' field.
   * @param value the value to set.
   */
  public void setAString(java.lang.CharSequence value) {
    this.aString = value;
  }

  /**
   * Gets the value of the 'aBytes' field.
   */
  public java.nio.ByteBuffer getABytes() {
    return aBytes;
  }

  /**
   * Sets the value of the 'aBytes' field.
   * @param value the value to set.
   */
  public void setABytes(java.nio.ByteBuffer value) {
    this.aBytes = value;
  }

  /**
   * Gets the value of the 'aFixed' field.
   */
  public com.maxpoint.cascading.avro.md5 getAFixed() {
    return aFixed;
  }

  /**
   * Sets the value of the 'aFixed' field.
   * @param value the value to set.
   */
  public void setAFixed(com.maxpoint.cascading.avro.md5 value) {
    this.aFixed = value;
  }

  /**
   * Gets the value of the 'aList' field.
   */
  public java.util.List<java.lang.Integer> getAList() {
    return aList;
  }

  /**
   * Sets the value of the 'aList' field.
   * @param value the value to set.
   */
  public void setAList(java.util.List<java.lang.Integer> value) {
    this.aList = value;
  }

  /**
   * Gets the value of the 'aMap' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.Integer> getAMap() {
    return aMap;
  }

  /**
   * Sets the value of the 'aMap' field.
   * @param value the value to set.
   */
  public void setAMap(java.util.Map<java.lang.CharSequence,java.lang.Integer> value) {
    this.aMap = value;
  }

  /**
   * Gets the value of the 'aUnion' field.
   */
  public java.lang.Integer getAUnion() {
    return aUnion;
  }

  /**
   * Sets the value of the 'aUnion' field.
   * @param value the value to set.
   */
  public void setAUnion(java.lang.Integer value) {
    this.aUnion = value;
  }

  /** Creates a new test1 RecordBuilder */
  public static com.maxpoint.cascading.avro.test1.Builder newBuilder() {
    return new com.maxpoint.cascading.avro.test1.Builder();
  }
  
  /** Creates a new test1 RecordBuilder by copying an existing Builder */
  public static com.maxpoint.cascading.avro.test1.Builder newBuilder(com.maxpoint.cascading.avro.test1.Builder other) {
    return new com.maxpoint.cascading.avro.test1.Builder(other);
  }
  
  /** Creates a new test1 RecordBuilder by copying an existing test1 instance */
  public static com.maxpoint.cascading.avro.test1.Builder newBuilder(com.maxpoint.cascading.avro.test1 other) {
    return new com.maxpoint.cascading.avro.test1.Builder(other);
  }
  
  /**
   * RecordBuilder for test1 instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<test1>
    implements org.apache.avro.data.RecordBuilder<test1> {

    private boolean aBoolean;
    private int anInt;
    private long aLong;
    private float aFloat;
    private double aDouble;
    private java.lang.CharSequence aString;
    private java.nio.ByteBuffer aBytes;
    private com.maxpoint.cascading.avro.md5 aFixed;
    private java.util.List<java.lang.Integer> aList;
    private java.util.Map<java.lang.CharSequence,java.lang.Integer> aMap;
    private java.lang.Integer aUnion;

    /** Creates a new Builder */
    private Builder() {
      super(com.maxpoint.cascading.avro.test1.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.maxpoint.cascading.avro.test1.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing test1 instance */
    private Builder(com.maxpoint.cascading.avro.test1 other) {
            super(com.maxpoint.cascading.avro.test1.SCHEMA$);
      if (isValidValue(fields()[0], other.aBoolean)) {
        this.aBoolean = data().deepCopy(fields()[0].schema(), other.aBoolean);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.anInt)) {
        this.anInt = data().deepCopy(fields()[1].schema(), other.anInt);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.aLong)) {
        this.aLong = data().deepCopy(fields()[2].schema(), other.aLong);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.aFloat)) {
        this.aFloat = data().deepCopy(fields()[3].schema(), other.aFloat);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.aDouble)) {
        this.aDouble = data().deepCopy(fields()[4].schema(), other.aDouble);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.aString)) {
        this.aString = data().deepCopy(fields()[5].schema(), other.aString);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.aBytes)) {
        this.aBytes = data().deepCopy(fields()[6].schema(), other.aBytes);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.aFixed)) {
        this.aFixed = data().deepCopy(fields()[7].schema(), other.aFixed);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.aList)) {
        this.aList = data().deepCopy(fields()[8].schema(), other.aList);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.aMap)) {
        this.aMap = data().deepCopy(fields()[9].schema(), other.aMap);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.aUnion)) {
        this.aUnion = data().deepCopy(fields()[10].schema(), other.aUnion);
        fieldSetFlags()[10] = true;
      }
    }

    /** Gets the value of the 'aBoolean' field */
    public java.lang.Boolean getABoolean() {
      return aBoolean;
    }
    
    /** Sets the value of the 'aBoolean' field */
    public com.maxpoint.cascading.avro.test1.Builder setABoolean(boolean value) {
      validate(fields()[0], value);
      this.aBoolean = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'aBoolean' field has been set */
    public boolean hasABoolean() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'aBoolean' field */
    public com.maxpoint.cascading.avro.test1.Builder clearABoolean() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'anInt' field */
    public java.lang.Integer getAnInt() {
      return anInt;
    }
    
    /** Sets the value of the 'anInt' field */
    public com.maxpoint.cascading.avro.test1.Builder setAnInt(int value) {
      validate(fields()[1], value);
      this.anInt = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'anInt' field has been set */
    public boolean hasAnInt() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'anInt' field */
    public com.maxpoint.cascading.avro.test1.Builder clearAnInt() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'aLong' field */
    public java.lang.Long getALong() {
      return aLong;
    }
    
    /** Sets the value of the 'aLong' field */
    public com.maxpoint.cascading.avro.test1.Builder setALong(long value) {
      validate(fields()[2], value);
      this.aLong = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'aLong' field has been set */
    public boolean hasALong() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'aLong' field */
    public com.maxpoint.cascading.avro.test1.Builder clearALong() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'aFloat' field */
    public java.lang.Float getAFloat() {
      return aFloat;
    }
    
    /** Sets the value of the 'aFloat' field */
    public com.maxpoint.cascading.avro.test1.Builder setAFloat(float value) {
      validate(fields()[3], value);
      this.aFloat = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'aFloat' field has been set */
    public boolean hasAFloat() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'aFloat' field */
    public com.maxpoint.cascading.avro.test1.Builder clearAFloat() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'aDouble' field */
    public java.lang.Double getADouble() {
      return aDouble;
    }
    
    /** Sets the value of the 'aDouble' field */
    public com.maxpoint.cascading.avro.test1.Builder setADouble(double value) {
      validate(fields()[4], value);
      this.aDouble = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'aDouble' field has been set */
    public boolean hasADouble() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'aDouble' field */
    public com.maxpoint.cascading.avro.test1.Builder clearADouble() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'aString' field */
    public java.lang.CharSequence getAString() {
      return aString;
    }
    
    /** Sets the value of the 'aString' field */
    public com.maxpoint.cascading.avro.test1.Builder setAString(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.aString = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'aString' field has been set */
    public boolean hasAString() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'aString' field */
    public com.maxpoint.cascading.avro.test1.Builder clearAString() {
      aString = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'aBytes' field */
    public java.nio.ByteBuffer getABytes() {
      return aBytes;
    }
    
    /** Sets the value of the 'aBytes' field */
    public com.maxpoint.cascading.avro.test1.Builder setABytes(java.nio.ByteBuffer value) {
      validate(fields()[6], value);
      this.aBytes = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'aBytes' field has been set */
    public boolean hasABytes() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'aBytes' field */
    public com.maxpoint.cascading.avro.test1.Builder clearABytes() {
      aBytes = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'aFixed' field */
    public com.maxpoint.cascading.avro.md5 getAFixed() {
      return aFixed;
    }
    
    /** Sets the value of the 'aFixed' field */
    public com.maxpoint.cascading.avro.test1.Builder setAFixed(com.maxpoint.cascading.avro.md5 value) {
      validate(fields()[7], value);
      this.aFixed = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'aFixed' field has been set */
    public boolean hasAFixed() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'aFixed' field */
    public com.maxpoint.cascading.avro.test1.Builder clearAFixed() {
      aFixed = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'aList' field */
    public java.util.List<java.lang.Integer> getAList() {
      return aList;
    }
    
    /** Sets the value of the 'aList' field */
    public com.maxpoint.cascading.avro.test1.Builder setAList(java.util.List<java.lang.Integer> value) {
      validate(fields()[8], value);
      this.aList = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'aList' field has been set */
    public boolean hasAList() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'aList' field */
    public com.maxpoint.cascading.avro.test1.Builder clearAList() {
      aList = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'aMap' field */
    public java.util.Map<java.lang.CharSequence,java.lang.Integer> getAMap() {
      return aMap;
    }
    
    /** Sets the value of the 'aMap' field */
    public com.maxpoint.cascading.avro.test1.Builder setAMap(java.util.Map<java.lang.CharSequence,java.lang.Integer> value) {
      validate(fields()[9], value);
      this.aMap = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'aMap' field has been set */
    public boolean hasAMap() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'aMap' field */
    public com.maxpoint.cascading.avro.test1.Builder clearAMap() {
      aMap = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /** Gets the value of the 'aUnion' field */
    public java.lang.Integer getAUnion() {
      return aUnion;
    }
    
    /** Sets the value of the 'aUnion' field */
    public com.maxpoint.cascading.avro.test1.Builder setAUnion(java.lang.Integer value) {
      validate(fields()[10], value);
      this.aUnion = value;
      fieldSetFlags()[10] = true;
      return this; 
    }
    
    /** Checks whether the 'aUnion' field has been set */
    public boolean hasAUnion() {
      return fieldSetFlags()[10];
    }
    
    /** Clears the value of the 'aUnion' field */
    public com.maxpoint.cascading.avro.test1.Builder clearAUnion() {
      aUnion = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    @Override
    public test1 build() {
      try {
        test1 record = new test1();
        record.aBoolean = fieldSetFlags()[0] ? this.aBoolean : (java.lang.Boolean) defaultValue(fields()[0]);
        record.anInt = fieldSetFlags()[1] ? this.anInt : (java.lang.Integer) defaultValue(fields()[1]);
        record.aLong = fieldSetFlags()[2] ? this.aLong : (java.lang.Long) defaultValue(fields()[2]);
        record.aFloat = fieldSetFlags()[3] ? this.aFloat : (java.lang.Float) defaultValue(fields()[3]);
        record.aDouble = fieldSetFlags()[4] ? this.aDouble : (java.lang.Double) defaultValue(fields()[4]);
        record.aString = fieldSetFlags()[5] ? this.aString : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.aBytes = fieldSetFlags()[6] ? this.aBytes : (java.nio.ByteBuffer) defaultValue(fields()[6]);
        record.aFixed = fieldSetFlags()[7] ? this.aFixed : (com.maxpoint.cascading.avro.md5) defaultValue(fields()[7]);
        record.aList = fieldSetFlags()[8] ? this.aList : (java.util.List<java.lang.Integer>) defaultValue(fields()[8]);
        record.aMap = fieldSetFlags()[9] ? this.aMap : (java.util.Map<java.lang.CharSequence,java.lang.Integer>) defaultValue(fields()[9]);
        record.aUnion = fieldSetFlags()[10] ? this.aUnion : (java.lang.Integer) defaultValue(fields()[10]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
