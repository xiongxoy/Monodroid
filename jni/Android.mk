LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

OPENCV_LIB_TYPE := STATIC
OPNECV_INSTALL_MODULES := on

include ../../sdk/native/jni/OpenCV.mk

LOCAL_MODULES := monoslam
LOCAL_MODULES += -llog -ldl


