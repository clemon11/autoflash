// **********************************************************************
//
// Copyright (c) 2003-2007 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

// Ice version 3.2.1

package rpc.slice;

public final class ActivitiesHelper
{
    public static void
    write(IceInternal.BasicStream __os, Activity[] __v)
    {
        if(__v == null)
        {
            __os.writeSize(0);
        }
        else
        {
            __os.writeSize(__v.length);
            for(int __i0 = 0; __i0 < __v.length; __i0++)
            {
                __v[__i0].__write(__os);
            }
        }
    }

    public static Activity[]
    read(IceInternal.BasicStream __is)
    {
        Activity[] __v;
        final int __len0 = __is.readSize();
        __is.checkFixedSeq(__len0, 13);
        __v = new Activity[__len0];
        for(int __i0 = 0; __i0 < __len0; __i0++)
        {
            __v[__i0] = new Activity();
            __v[__i0].__read(__is);
        }
        return __v;
    }
}
