package mako.application.itunesearcher.databinding;
import mako.application.itunesearcher.R;
import mako.application.itunesearcher.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.home_input, 2);
        sViewsWithIds.put(R.id.home_spinner, 3);
        sViewsWithIds.put(R.id.home_result_list, 4);
        sViewsWithIds.put(R.id.home_no_result, 5);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.RelativeLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatEditText) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (android.widget.Spinner) bindings[3]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.isProcessing == variableId) {
            setIsProcessing((java.lang.Boolean) variable);
        }
        else if (BR.showMainProgress == variableId) {
            setShowMainProgress((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIsProcessing(@Nullable java.lang.Boolean IsProcessing) {
        this.mIsProcessing = IsProcessing;
    }
    public void setShowMainProgress(@Nullable java.lang.Boolean ShowMainProgress) {
        this.mShowMainProgress = ShowMainProgress;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.showMainProgress);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        boolean androidxDatabindingViewDataBindingSafeUnboxShowMainProgress = false;
        java.lang.Boolean showMainProgress = mShowMainProgress;
        int showMainProgressViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x6L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(showMainProgress)
                androidxDatabindingViewDataBindingSafeUnboxShowMainProgress = androidx.databinding.ViewDataBinding.safeUnbox(showMainProgress);
            if((dirtyFlags & 0x6L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxShowMainProgress) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(showMainProgress) ? View.VISIBLE : View.GONE
                showMainProgressViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxShowMainProgress) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(showMainProgressViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): isProcessing
        flag 1 (0x2L): showMainProgress
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(showMainProgress) ? View.VISIBLE : View.GONE
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(showMainProgress) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}