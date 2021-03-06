/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class xbird_util_Primitives */

#ifndef _Included_xbird_util_Primitives
#define _Included_xbird_util_Primitives
#ifdef __cplusplus
extern "C" {
#endif
#undef xbird_util_Primitives_INTEGER_BYTES
#define xbird_util_Primitives_INTEGER_BYTES 4L
#undef xbird_util_Primitives_LONG_BYTES
#define xbird_util_Primitives_LONG_BYTES 8L
#undef xbird_util_Primitives_UPPER_NIBBLE_MASK
#define xbird_util_Primitives_UPPER_NIBBLE_MASK 240L
#undef xbird_util_Primitives_LOWER_NIBBLE_MASK
#define xbird_util_Primitives_LOWER_NIBBLE_MASK 15L
/*
 * Class:     xbird_util_Primitives
 * Method:    toIntsJni
 * Signature: ([BII)[I
 */
JNIEXPORT jintArray JNICALL Java_xbird_util_Primitives_toIntsJni
  (JNIEnv *, jclass, jbyteArray, jint, jint);

/*
 * Class:     xbird_util_Primitives
 * Method:    toLongsJni
 * Signature: ([BII)[J
 */
JNIEXPORT jlongArray JNICALL Java_xbird_util_Primitives_toLongsJni
  (JNIEnv *, jclass, jbyteArray, jint, jint);

#ifdef __cplusplus
}
#endif
#endif
