package mako.application.itunesearcher;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mako.application.itunesearcher.databinding.CellDetailsBindingImpl;
import mako.application.itunesearcher.databinding.CellFooterBindingImpl;
import mako.application.itunesearcher.databinding.FragmentFavouriteBindingImpl;
import mako.application.itunesearcher.databinding.FragmentHomeBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_CELLDETAILS = 1;

  private static final int LAYOUT_CELLFOOTER = 2;

  private static final int LAYOUT_FRAGMENTFAVOURITE = 3;

  private static final int LAYOUT_FRAGMENTHOME = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(mako.application.itunesearcher.R.layout.cell_details, LAYOUT_CELLDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(mako.application.itunesearcher.R.layout.cell_footer, LAYOUT_CELLFOOTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(mako.application.itunesearcher.R.layout.fragment_favourite, LAYOUT_FRAGMENTFAVOURITE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(mako.application.itunesearcher.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_CELLDETAILS: {
          if ("layout/cell_details_0".equals(tag)) {
            return new CellDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for cell_details is invalid. Received: " + tag);
        }
        case  LAYOUT_CELLFOOTER: {
          if ("layout/cell_footer_0".equals(tag)) {
            return new CellFooterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for cell_footer is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFAVOURITE: {
          if ("layout/fragment_favourite_0".equals(tag)) {
            return new FragmentFavouriteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_favourite is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "isProcessing");
      sKeys.put(2, "showMainProgress");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/cell_details_0", mako.application.itunesearcher.R.layout.cell_details);
      sKeys.put("layout/cell_footer_0", mako.application.itunesearcher.R.layout.cell_footer);
      sKeys.put("layout/fragment_favourite_0", mako.application.itunesearcher.R.layout.fragment_favourite);
      sKeys.put("layout/fragment_home_0", mako.application.itunesearcher.R.layout.fragment_home);
    }
  }
}
